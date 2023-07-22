@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionKernelCapabilitiesPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.KernelCapabilitiesProperty.Builder =
      CfnTaskDefinition.KernelCapabilitiesProperty.builder()

  private val _add: MutableList<String> = mutableListOf()

  private val _drop: MutableList<String> = mutableListOf()

  /**
   * @param add The Linux capabilities for the container that have been added to the default
   * configuration provided by Docker.
   * This parameter maps to `CapAdd` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--cap-add`
   * option to [docker
   * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
   * .
   *
   *
   * Tasks launched on AWS Fargate only support adding the `SYS_PTRACE` kernel capability.
   *
   *
   * Valid values: `"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" |
   * "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" |
   * "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" |
   * "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" |
   * "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" |
   * "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"`
   */
  public fun add(vararg add: String) {
    _add.addAll(listOf(*add))
  }

  /**
   * @param add The Linux capabilities for the container that have been added to the default
   * configuration provided by Docker.
   * This parameter maps to `CapAdd` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--cap-add`
   * option to [docker
   * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
   * .
   *
   *
   * Tasks launched on AWS Fargate only support adding the `SYS_PTRACE` kernel capability.
   *
   *
   * Valid values: `"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" |
   * "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" |
   * "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" |
   * "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" |
   * "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" |
   * "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"`
   */
  public fun add(add: Collection<String>) {
    _add.addAll(add)
  }

  /**
   * @param drop The Linux capabilities for the container that have been removed from the default
   * configuration provided by Docker.
   * This parameter maps to `CapDrop` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--cap-drop`
   * option to [docker
   * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
   * .
   *
   * Valid values: `"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" |
   * "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" |
   * "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" |
   * "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" |
   * "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" |
   * "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"`
   */
  public fun drop(vararg drop: String) {
    _drop.addAll(listOf(*drop))
  }

  /**
   * @param drop The Linux capabilities for the container that have been removed from the default
   * configuration provided by Docker.
   * This parameter maps to `CapDrop` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--cap-drop`
   * option to [docker
   * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
   * .
   *
   * Valid values: `"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" |
   * "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" |
   * "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" |
   * "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" |
   * "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" |
   * "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"`
   */
  public fun drop(drop: Collection<String>) {
    _drop.addAll(drop)
  }

  public fun build(): CfnTaskDefinition.KernelCapabilitiesProperty {
    if(_add.isNotEmpty()) cdkBuilder.add(_add)
    if(_drop.isNotEmpty()) cdkBuilder.drop(_drop)
    return cdkBuilder.build()
  }
}
