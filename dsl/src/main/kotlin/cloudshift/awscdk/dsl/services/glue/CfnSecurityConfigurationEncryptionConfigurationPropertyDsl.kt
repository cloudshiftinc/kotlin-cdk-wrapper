@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration

@CdkDslMarker
public class CfnSecurityConfigurationEncryptionConfigurationPropertyDsl {
  private val cdkBuilder: CfnSecurityConfiguration.EncryptionConfigurationProperty.Builder =
      CfnSecurityConfiguration.EncryptionConfigurationProperty.builder()

  private val _s3Encryptions: MutableList<Any> = mutableListOf()

  /**
   * @param cloudWatchEncryption The encryption configuration for Amazon CloudWatch.
   */
  public fun cloudWatchEncryption(cloudWatchEncryption: IResolvable) {
    cdkBuilder.cloudWatchEncryption(cloudWatchEncryption)
  }

  /**
   * @param cloudWatchEncryption The encryption configuration for Amazon CloudWatch.
   */
  public
      fun cloudWatchEncryption(cloudWatchEncryption: CfnSecurityConfiguration.CloudWatchEncryptionProperty) {
    cdkBuilder.cloudWatchEncryption(cloudWatchEncryption)
  }

  /**
   * @param jobBookmarksEncryption The encryption configuration for job bookmarks.
   */
  public fun jobBookmarksEncryption(jobBookmarksEncryption: IResolvable) {
    cdkBuilder.jobBookmarksEncryption(jobBookmarksEncryption)
  }

  /**
   * @param jobBookmarksEncryption The encryption configuration for job bookmarks.
   */
  public
      fun jobBookmarksEncryption(jobBookmarksEncryption: CfnSecurityConfiguration.JobBookmarksEncryptionProperty) {
    cdkBuilder.jobBookmarksEncryption(jobBookmarksEncryption)
  }

  /**
   * @param s3Encryptions The encyption configuration for Amazon Simple Storage Service (Amazon S3)
   * data.
   */
  public fun s3Encryptions(vararg s3Encryptions: Any) {
    _s3Encryptions.addAll(listOf(*s3Encryptions))
  }

  /**
   * @param s3Encryptions The encyption configuration for Amazon Simple Storage Service (Amazon S3)
   * data.
   */
  public fun s3Encryptions(s3Encryptions: Collection<Any>) {
    _s3Encryptions.addAll(s3Encryptions)
  }

  /**
   * @param s3Encryptions The encyption configuration for Amazon Simple Storage Service (Amazon S3)
   * data.
   */
  public fun s3Encryptions(s3Encryptions: IResolvable) {
    cdkBuilder.s3Encryptions(s3Encryptions)
  }

  public fun build(): CfnSecurityConfiguration.EncryptionConfigurationProperty {
    if(_s3Encryptions.isNotEmpty()) cdkBuilder.s3Encryptions(_s3Encryptions)
    return cdkBuilder.build()
  }
}
