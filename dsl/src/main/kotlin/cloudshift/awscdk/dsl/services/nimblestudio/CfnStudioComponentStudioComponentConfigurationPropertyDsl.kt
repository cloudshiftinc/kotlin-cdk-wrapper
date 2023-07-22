@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent

@CdkDslMarker
public class CfnStudioComponentStudioComponentConfigurationPropertyDsl {
  private val cdkBuilder: CfnStudioComponent.StudioComponentConfigurationProperty.Builder =
      CfnStudioComponent.StudioComponentConfigurationProperty.builder()

  /**
   * @param activeDirectoryConfiguration The configuration for a AWS Directory Service for Microsoft
   * Active Directory studio resource.
   */
  public fun activeDirectoryConfiguration(activeDirectoryConfiguration: IResolvable) {
    cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration)
  }

  /**
   * @param activeDirectoryConfiguration The configuration for a AWS Directory Service for Microsoft
   * Active Directory studio resource.
   */
  public
      fun activeDirectoryConfiguration(activeDirectoryConfiguration: CfnStudioComponent.ActiveDirectoryConfigurationProperty) {
    cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration)
  }

  /**
   * @param computeFarmConfiguration The configuration for a render farm that is associated with a
   * studio resource.
   */
  public fun computeFarmConfiguration(computeFarmConfiguration: IResolvable) {
    cdkBuilder.computeFarmConfiguration(computeFarmConfiguration)
  }

  /**
   * @param computeFarmConfiguration The configuration for a render farm that is associated with a
   * studio resource.
   */
  public
      fun computeFarmConfiguration(computeFarmConfiguration: CfnStudioComponent.ComputeFarmConfigurationProperty) {
    cdkBuilder.computeFarmConfiguration(computeFarmConfiguration)
  }

  /**
   * @param licenseServiceConfiguration The configuration for a license service that is associated
   * with a studio resource.
   */
  public fun licenseServiceConfiguration(licenseServiceConfiguration: IResolvable) {
    cdkBuilder.licenseServiceConfiguration(licenseServiceConfiguration)
  }

  /**
   * @param licenseServiceConfiguration The configuration for a license service that is associated
   * with a studio resource.
   */
  public
      fun licenseServiceConfiguration(licenseServiceConfiguration: CfnStudioComponent.LicenseServiceConfigurationProperty) {
    cdkBuilder.licenseServiceConfiguration(licenseServiceConfiguration)
  }

  /**
   * @param sharedFileSystemConfiguration The configuration for a shared file storage system that is
   * associated with a studio resource.
   */
  public fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: IResolvable) {
    cdkBuilder.sharedFileSystemConfiguration(sharedFileSystemConfiguration)
  }

  /**
   * @param sharedFileSystemConfiguration The configuration for a shared file storage system that is
   * associated with a studio resource.
   */
  public
      fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: CfnStudioComponent.SharedFileSystemConfigurationProperty) {
    cdkBuilder.sharedFileSystemConfiguration(sharedFileSystemConfiguration)
  }

  public fun build(): CfnStudioComponent.StudioComponentConfigurationProperty = cdkBuilder.build()
}
