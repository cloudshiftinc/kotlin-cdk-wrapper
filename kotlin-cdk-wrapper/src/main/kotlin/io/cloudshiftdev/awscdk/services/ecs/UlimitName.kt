@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

public enum class UlimitName(
  private val cdkObject: software.amazon.awscdk.services.ecs.UlimitName,
) {
  CORE(software.amazon.awscdk.services.ecs.UlimitName.CORE),
  CPU(software.amazon.awscdk.services.ecs.UlimitName.CPU),
  DATA(software.amazon.awscdk.services.ecs.UlimitName.DATA),
  FSIZE(software.amazon.awscdk.services.ecs.UlimitName.FSIZE),
  LOCKS(software.amazon.awscdk.services.ecs.UlimitName.LOCKS),
  MEMLOCK(software.amazon.awscdk.services.ecs.UlimitName.MEMLOCK),
  MSGQUEUE(software.amazon.awscdk.services.ecs.UlimitName.MSGQUEUE),
  NICE(software.amazon.awscdk.services.ecs.UlimitName.NICE),
  NOFILE(software.amazon.awscdk.services.ecs.UlimitName.NOFILE),
  NPROC(software.amazon.awscdk.services.ecs.UlimitName.NPROC),
  RSS(software.amazon.awscdk.services.ecs.UlimitName.RSS),
  RTPRIO(software.amazon.awscdk.services.ecs.UlimitName.RTPRIO),
  RTTIME(software.amazon.awscdk.services.ecs.UlimitName.RTTIME),
  SIGPENDING(software.amazon.awscdk.services.ecs.UlimitName.SIGPENDING),
  STACK(software.amazon.awscdk.services.ecs.UlimitName.STACK),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.UlimitName): UlimitName = when
        (cdkObject) {
      software.amazon.awscdk.services.ecs.UlimitName.CORE -> UlimitName.CORE
      software.amazon.awscdk.services.ecs.UlimitName.CPU -> UlimitName.CPU
      software.amazon.awscdk.services.ecs.UlimitName.DATA -> UlimitName.DATA
      software.amazon.awscdk.services.ecs.UlimitName.FSIZE -> UlimitName.FSIZE
      software.amazon.awscdk.services.ecs.UlimitName.LOCKS -> UlimitName.LOCKS
      software.amazon.awscdk.services.ecs.UlimitName.MEMLOCK -> UlimitName.MEMLOCK
      software.amazon.awscdk.services.ecs.UlimitName.MSGQUEUE -> UlimitName.MSGQUEUE
      software.amazon.awscdk.services.ecs.UlimitName.NICE -> UlimitName.NICE
      software.amazon.awscdk.services.ecs.UlimitName.NOFILE -> UlimitName.NOFILE
      software.amazon.awscdk.services.ecs.UlimitName.NPROC -> UlimitName.NPROC
      software.amazon.awscdk.services.ecs.UlimitName.RSS -> UlimitName.RSS
      software.amazon.awscdk.services.ecs.UlimitName.RTPRIO -> UlimitName.RTPRIO
      software.amazon.awscdk.services.ecs.UlimitName.RTTIME -> UlimitName.RTTIME
      software.amazon.awscdk.services.ecs.UlimitName.SIGPENDING -> UlimitName.SIGPENDING
      software.amazon.awscdk.services.ecs.UlimitName.STACK -> UlimitName.STACK
    }

    internal fun unwrap(wrapped: UlimitName): software.amazon.awscdk.services.ecs.UlimitName =
        wrapped.cdkObject
  }
}
