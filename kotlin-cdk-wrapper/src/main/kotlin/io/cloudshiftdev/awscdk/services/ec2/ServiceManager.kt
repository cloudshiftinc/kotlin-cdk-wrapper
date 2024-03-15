@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

public enum class ServiceManager(
  private val cdkObject: software.amazon.awscdk.services.ec2.ServiceManager,
) {
  SYSVINIT(software.amazon.awscdk.services.ec2.ServiceManager.SYSVINIT),
  WINDOWS(software.amazon.awscdk.services.ec2.ServiceManager.WINDOWS),
  SYSTEMD(software.amazon.awscdk.services.ec2.ServiceManager.SYSTEMD),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ServiceManager): ServiceManager
        = when (cdkObject) {
      software.amazon.awscdk.services.ec2.ServiceManager.SYSVINIT -> ServiceManager.SYSVINIT
      software.amazon.awscdk.services.ec2.ServiceManager.WINDOWS -> ServiceManager.WINDOWS
      software.amazon.awscdk.services.ec2.ServiceManager.SYSTEMD -> ServiceManager.SYSTEMD
    }

    internal fun unwrap(wrapped: ServiceManager): software.amazon.awscdk.services.ec2.ServiceManager
        = wrapped.cdkObject
  }
}
