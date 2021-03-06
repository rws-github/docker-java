package com.github.dockerjava.client.model;


import java.util.Arrays;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Konstantin Pelykh (kpelykh@gmail.com)
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContainerInspectResponse {

    @JsonProperty("ID")
    private String id;

    @JsonProperty("Created")
    private String created;

    @JsonProperty("Path")
    private String path;

    @JsonProperty("Args")
    private String[] args;

    @JsonProperty("Config")
    public ContainerConfig config;

    @JsonProperty("State")
    private ContainerState state;

    @JsonProperty("Image")
    private String imageId;

    @JsonProperty("NetworkSettings")
    private NetworkSettings networkSettings;

    @JsonProperty("SysInitPath")
    private String sysInitPath;

    @JsonProperty("ResolvConfPath")
    private String resolvConfPath;

    @JsonProperty("Volumes")
    private Map<String, String> volumes;

    @JsonProperty("VolumesRW")
    private Map<String, Boolean> volumesRW;

    @JsonProperty("HostnamePath")
    private String hostnamePath;

    @JsonProperty("HostsPath")
    private String hostsPath;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Driver")
    private String driver;

    @JsonProperty("HostConfig")
    private HostConfig hostConfig;

    @JsonProperty("ExecDriver")
    private String execDriver;
    
    @JsonProperty("MountLabel")
    private String mountLabel;
    
    public String getId() {
        return id;
    }

    public String getCreated() {
        return created;
    }

    public String getPath() {
        return path;
    }

    public String[] getArgs() {
        return args;
    }

    public ContainerConfig getConfig() {
        return config;
    }

    public ContainerState getState() {
        return state;
    }

    public String getImageId() {
        return imageId;
    }

    public NetworkSettings getNetworkSettings() {
        return networkSettings;
    }

    public String getSysInitPath() {
        return sysInitPath;
    }

    public String getResolvConfPath() {
        return resolvConfPath;
    }

    public Map<String, String> getVolumes() {
        return volumes;
    }

    public Map<String, Boolean> getVolumesRW() {
        return volumesRW;
    }

    public String getHostnamePath() {
        return hostnamePath;
    }

    public String getHostsPath() {
        return hostsPath;
    }

    public String getName() {
        return name;
    }

    public String getDriver() {
        return driver;
    }

    public HostConfig getHostConfig() {
        return hostConfig;
    }
    
    public String getExecDriver() {
		return execDriver;
	}
    
    public String getMountLabel() {
		return mountLabel;
	}

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class NetworkSettings {

        @JsonProperty("IPAddress") private String ipAddress;
        @JsonProperty("IPPrefixLen") private int ipPrefixLen;
        @JsonProperty("Gateway") private String gateway;
        @JsonProperty("Bridge") private String bridge;
        @JsonProperty("PortMapping") private Map<String,Map<String, String>> portMapping;
        @JsonProperty("Ports") private Ports ports;
        
        public String getIpAddress() {
			return ipAddress;
		}

		public int getIpPrefixLen() {
			return ipPrefixLen;
		}

		public String getGateway() {
			return gateway;
		}

		public String getBridge() {
			return bridge;
		}

		public Map<String, Map<String, String>> getPortMapping() {
			return portMapping;
		}

		public Ports getPorts() {
			return ports;
		}


		@Override
        public String toString() {
            return "NetworkSettings{" +
                    "ports=" + ports +
                    ", portMapping=" + portMapping +
                    ", bridge='" + bridge + '\'' +
                    ", gateway='" + gateway + '\'' +
                    ", ipPrefixLen=" + ipPrefixLen +
                    ", ipAddress='" + ipAddress + '\'' +
                    '}';
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class ContainerState {

        @JsonProperty("Running") private boolean running;
        @JsonProperty("Paused") private boolean paused;
        @JsonProperty("Pid") private int pid;
        @JsonProperty("ExitCode") private int exitCode;
        @JsonProperty("StartedAt") private String startedAt;
        @JsonProperty("FinishedAt") private String finishedAt;
        
        public boolean isRunning() {
			return running;
		}

		public boolean isPaused() {
			return paused;
		}

		public int getPid() {
			return pid;
		}

		public int getExitCode() {
			return exitCode;
		}

		public String getStartedAt() {
			return startedAt;
		}

		public String getFinishedAt() {
			return finishedAt;
		}

		@Override
        public String toString() {
            return "ContainerState{" +
                    "running=" + running +
                    ", paused=" + paused +
                    ", pid=" + pid +
                    ", exitCode=" + exitCode +
                    ", startedAt='" + startedAt + '\'' +
                    ", finishedAt='" + finishedAt + '\'' +
                    '}';
        }
    }
    
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class HostConfig {

        @JsonProperty("Binds")
        private String[] binds;
        
        @JsonProperty("LxcConf")
        private LxcConf[] lxcConf;
        
        @JsonProperty("PortBindings")
        private Ports portBindings;
        
        @JsonProperty("PublishAllPorts")
        private boolean publishAllPorts;
        
        @JsonProperty("Privileged")
        private boolean privileged;
        
        @JsonProperty("Dns")
        private String dns;
        
        @JsonProperty("VolumesFrom")
        private String volumesFrom;

        @JsonProperty("ContainerIDFile")
        private String containerIDFile;
        
        @JsonProperty("DnsSearch")
        private String dnsSearch;
        
        @JsonProperty("Links")
        private String[] links;

        @JsonProperty("NetworkMode")
        private String networkMode;
        
        public String[] getBinds() {
			return binds;
		}

        public LxcConf[] getLxcConf() {
			return lxcConf;
		}

		public Ports getPortBindings() {
			return portBindings;
		}

		public boolean isPublishAllPorts() {
			return publishAllPorts;
		}

		public boolean isPrivileged() {
			return privileged;
		}

		public String getDns() {
			return dns;
		}

		public String getVolumesFrom() {
			return volumesFrom;
		}

		public String getContainerIDFile() {
			return containerIDFile;
		}

		public String getDnsSearch() {
			return dnsSearch;
		}

		public String[] getLinks() {
			return links;
		}

		public String getNetworkMode() {
			return networkMode;
		}

		@Override
        public String toString() {
            return "HostConfig{" +
                    "binds=" + Arrays.toString(binds) +
                    ", containerIDFile='" + containerIDFile + '\'' +
                    ", lxcConf=" + Arrays.toString(lxcConf) +
                    ", links=" + Arrays.toString(links) +
                    ", portBindings=" + portBindings +
                    ", privileged=" + privileged +
                    ", publishAllPorts=" + publishAllPorts +
                    ", networkMode=" + networkMode +
                    ", dns='" + dns + '\'' +
                    '}';
        }

    }

}
