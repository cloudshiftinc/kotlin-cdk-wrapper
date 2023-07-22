@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

/**
 * Represents the settings used to enable server-side encryption.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * SSESpecificationProperty sSESpecificationProperty = SSESpecificationProperty.builder()
 * .sseEnabled(false)
 * // the properties below are optional
 * .sseType("sseType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-ssespecification.html)
 */
@CdkDslMarker
public class CfnGlobalTableSSESpecificationPropertyDsl {
  private val cdkBuilder: CfnGlobalTable.SSESpecificationProperty.Builder =
      CfnGlobalTable.SSESpecificationProperty.builder()

  /**
   * @param sseEnabled Indicates whether server-side encryption is performed using an AWS managed
   * key or an AWS owned key. 
   * If enabled (true), server-side encryption type is set to KMS and an AWS managed key is used (
   * AWS KMS charges apply). If disabled (false) or not specified,server-side encryption is set to an
   * AWS owned key. If you choose to use KMS encryption, you can also use customer managed KMS keys by
   * specifying them in the `ReplicaSpecification.SSESpecification` object. You cannot mix AWS managed
   * and customer managed KMS keys.
   */
  public fun sseEnabled(sseEnabled: Boolean) {
    cdkBuilder.sseEnabled(sseEnabled)
  }

  /**
   * @param sseEnabled Indicates whether server-side encryption is performed using an AWS managed
   * key or an AWS owned key. 
   * If enabled (true), server-side encryption type is set to KMS and an AWS managed key is used (
   * AWS KMS charges apply). If disabled (false) or not specified,server-side encryption is set to an
   * AWS owned key. If you choose to use KMS encryption, you can also use customer managed KMS keys by
   * specifying them in the `ReplicaSpecification.SSESpecification` object. You cannot mix AWS managed
   * and customer managed KMS keys.
   */
  public fun sseEnabled(sseEnabled: IResolvable) {
    cdkBuilder.sseEnabled(sseEnabled)
  }

  /**
   * @param sseType Server-side encryption type. The only supported value is:.
   * * `KMS` - Server-side encryption that uses AWS Key Management Service . The key is stored in
   * your account and is managed by AWS KMS ( AWS KMS charges apply).
   */
  public fun sseType(sseType: String) {
    cdkBuilder.sseType(sseType)
  }

  public fun build(): CfnGlobalTable.SSESpecificationProperty = cdkBuilder.build()
}
