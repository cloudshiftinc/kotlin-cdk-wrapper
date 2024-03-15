@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

public enum class Capability(
  private val cdkObject: software.amazon.awscdk.services.ecs.Capability,
) {
  ALL(software.amazon.awscdk.services.ecs.Capability.ALL),
  AUDIT_CONTROL(software.amazon.awscdk.services.ecs.Capability.AUDIT_CONTROL),
  AUDIT_WRITE(software.amazon.awscdk.services.ecs.Capability.AUDIT_WRITE),
  BLOCK_SUSPEND(software.amazon.awscdk.services.ecs.Capability.BLOCK_SUSPEND),
  CHOWN(software.amazon.awscdk.services.ecs.Capability.CHOWN),
  DAC_OVERRIDE(software.amazon.awscdk.services.ecs.Capability.DAC_OVERRIDE),
  DAC_READ_SEARCH(software.amazon.awscdk.services.ecs.Capability.DAC_READ_SEARCH),
  FOWNER(software.amazon.awscdk.services.ecs.Capability.FOWNER),
  FSETID(software.amazon.awscdk.services.ecs.Capability.FSETID),
  IPC_LOCK(software.amazon.awscdk.services.ecs.Capability.IPC_LOCK),
  IPC_OWNER(software.amazon.awscdk.services.ecs.Capability.IPC_OWNER),
  KILL(software.amazon.awscdk.services.ecs.Capability.KILL),
  LEASE(software.amazon.awscdk.services.ecs.Capability.LEASE),
  LINUX_IMMUTABLE(software.amazon.awscdk.services.ecs.Capability.LINUX_IMMUTABLE),
  MAC_ADMIN(software.amazon.awscdk.services.ecs.Capability.MAC_ADMIN),
  MAC_OVERRIDE(software.amazon.awscdk.services.ecs.Capability.MAC_OVERRIDE),
  MKNOD(software.amazon.awscdk.services.ecs.Capability.MKNOD),
  NET_ADMIN(software.amazon.awscdk.services.ecs.Capability.NET_ADMIN),
  NET_BIND_SERVICE(software.amazon.awscdk.services.ecs.Capability.NET_BIND_SERVICE),
  NET_BROADCAST(software.amazon.awscdk.services.ecs.Capability.NET_BROADCAST),
  NET_RAW(software.amazon.awscdk.services.ecs.Capability.NET_RAW),
  SETFCAP(software.amazon.awscdk.services.ecs.Capability.SETFCAP),
  SETGID(software.amazon.awscdk.services.ecs.Capability.SETGID),
  SETPCAP(software.amazon.awscdk.services.ecs.Capability.SETPCAP),
  SETUID(software.amazon.awscdk.services.ecs.Capability.SETUID),
  SYS_ADMIN(software.amazon.awscdk.services.ecs.Capability.SYS_ADMIN),
  SYS_BOOT(software.amazon.awscdk.services.ecs.Capability.SYS_BOOT),
  SYS_CHROOT(software.amazon.awscdk.services.ecs.Capability.SYS_CHROOT),
  SYS_MODULE(software.amazon.awscdk.services.ecs.Capability.SYS_MODULE),
  SYS_NICE(software.amazon.awscdk.services.ecs.Capability.SYS_NICE),
  SYS_PACCT(software.amazon.awscdk.services.ecs.Capability.SYS_PACCT),
  SYS_PTRACE(software.amazon.awscdk.services.ecs.Capability.SYS_PTRACE),
  SYS_RAWIO(software.amazon.awscdk.services.ecs.Capability.SYS_RAWIO),
  SYS_RESOURCE(software.amazon.awscdk.services.ecs.Capability.SYS_RESOURCE),
  SYS_TIME(software.amazon.awscdk.services.ecs.Capability.SYS_TIME),
  SYS_TTY_CONFIG(software.amazon.awscdk.services.ecs.Capability.SYS_TTY_CONFIG),
  SYSLOG(software.amazon.awscdk.services.ecs.Capability.SYSLOG),
  WAKE_ALARM(software.amazon.awscdk.services.ecs.Capability.WAKE_ALARM),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Capability): Capability = when
        (cdkObject) {
      software.amazon.awscdk.services.ecs.Capability.ALL -> Capability.ALL
      software.amazon.awscdk.services.ecs.Capability.AUDIT_CONTROL -> Capability.AUDIT_CONTROL
      software.amazon.awscdk.services.ecs.Capability.AUDIT_WRITE -> Capability.AUDIT_WRITE
      software.amazon.awscdk.services.ecs.Capability.BLOCK_SUSPEND -> Capability.BLOCK_SUSPEND
      software.amazon.awscdk.services.ecs.Capability.CHOWN -> Capability.CHOWN
      software.amazon.awscdk.services.ecs.Capability.DAC_OVERRIDE -> Capability.DAC_OVERRIDE
      software.amazon.awscdk.services.ecs.Capability.DAC_READ_SEARCH -> Capability.DAC_READ_SEARCH
      software.amazon.awscdk.services.ecs.Capability.FOWNER -> Capability.FOWNER
      software.amazon.awscdk.services.ecs.Capability.FSETID -> Capability.FSETID
      software.amazon.awscdk.services.ecs.Capability.IPC_LOCK -> Capability.IPC_LOCK
      software.amazon.awscdk.services.ecs.Capability.IPC_OWNER -> Capability.IPC_OWNER
      software.amazon.awscdk.services.ecs.Capability.KILL -> Capability.KILL
      software.amazon.awscdk.services.ecs.Capability.LEASE -> Capability.LEASE
      software.amazon.awscdk.services.ecs.Capability.LINUX_IMMUTABLE -> Capability.LINUX_IMMUTABLE
      software.amazon.awscdk.services.ecs.Capability.MAC_ADMIN -> Capability.MAC_ADMIN
      software.amazon.awscdk.services.ecs.Capability.MAC_OVERRIDE -> Capability.MAC_OVERRIDE
      software.amazon.awscdk.services.ecs.Capability.MKNOD -> Capability.MKNOD
      software.amazon.awscdk.services.ecs.Capability.NET_ADMIN -> Capability.NET_ADMIN
      software.amazon.awscdk.services.ecs.Capability.NET_BIND_SERVICE -> Capability.NET_BIND_SERVICE
      software.amazon.awscdk.services.ecs.Capability.NET_BROADCAST -> Capability.NET_BROADCAST
      software.amazon.awscdk.services.ecs.Capability.NET_RAW -> Capability.NET_RAW
      software.amazon.awscdk.services.ecs.Capability.SETFCAP -> Capability.SETFCAP
      software.amazon.awscdk.services.ecs.Capability.SETGID -> Capability.SETGID
      software.amazon.awscdk.services.ecs.Capability.SETPCAP -> Capability.SETPCAP
      software.amazon.awscdk.services.ecs.Capability.SETUID -> Capability.SETUID
      software.amazon.awscdk.services.ecs.Capability.SYS_ADMIN -> Capability.SYS_ADMIN
      software.amazon.awscdk.services.ecs.Capability.SYS_BOOT -> Capability.SYS_BOOT
      software.amazon.awscdk.services.ecs.Capability.SYS_CHROOT -> Capability.SYS_CHROOT
      software.amazon.awscdk.services.ecs.Capability.SYS_MODULE -> Capability.SYS_MODULE
      software.amazon.awscdk.services.ecs.Capability.SYS_NICE -> Capability.SYS_NICE
      software.amazon.awscdk.services.ecs.Capability.SYS_PACCT -> Capability.SYS_PACCT
      software.amazon.awscdk.services.ecs.Capability.SYS_PTRACE -> Capability.SYS_PTRACE
      software.amazon.awscdk.services.ecs.Capability.SYS_RAWIO -> Capability.SYS_RAWIO
      software.amazon.awscdk.services.ecs.Capability.SYS_RESOURCE -> Capability.SYS_RESOURCE
      software.amazon.awscdk.services.ecs.Capability.SYS_TIME -> Capability.SYS_TIME
      software.amazon.awscdk.services.ecs.Capability.SYS_TTY_CONFIG -> Capability.SYS_TTY_CONFIG
      software.amazon.awscdk.services.ecs.Capability.SYSLOG -> Capability.SYSLOG
      software.amazon.awscdk.services.ecs.Capability.WAKE_ALARM -> Capability.WAKE_ALARM
    }

    internal fun unwrap(wrapped: Capability): software.amazon.awscdk.services.ecs.Capability =
        wrapped.cdkObject
  }
}
