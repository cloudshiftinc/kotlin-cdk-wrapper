@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketBucketEncryptionPropertyDsl {
  private val cdkBuilder: CfnBucket.BucketEncryptionProperty.Builder =
      CfnBucket.BucketEncryptionProperty.builder()

  private val _serverSideEncryptionConfiguration: MutableList<Any> = mutableListOf()

  /**
   * @param serverSideEncryptionConfiguration Specifies the default server-side-encryption
   * configuration. 
   */
  public fun serverSideEncryptionConfiguration(vararg serverSideEncryptionConfiguration: Any) {
    _serverSideEncryptionConfiguration.addAll(listOf(*serverSideEncryptionConfiguration))
  }

  /**
   * @param serverSideEncryptionConfiguration Specifies the default server-side-encryption
   * configuration. 
   */
  public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: Collection<Any>) {
    _serverSideEncryptionConfiguration.addAll(serverSideEncryptionConfiguration)
  }

  /**
   * @param serverSideEncryptionConfiguration Specifies the default server-side-encryption
   * configuration. 
   */
  public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
    cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
  }

  public fun build(): CfnBucket.BucketEncryptionProperty {
    if(_serverSideEncryptionConfiguration.isNotEmpty())
        cdkBuilder.serverSideEncryptionConfiguration(_serverSideEncryptionConfiguration)
    return cdkBuilder.build()
  }
}
