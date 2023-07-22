@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnKeySigningKey
import software.constructs.Construct

@CdkDslMarker
public class CfnKeySigningKeyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnKeySigningKey.Builder = CfnKeySigningKey.Builder.create(scope, id)

  /**
   * The unique string (ID) that is used to identify a hosted zone.
   *
   * For example: `Z00001111A1ABCaaABC11` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html#cfn-route53-keysigningkey-hostedzoneid)
   * @param hostedZoneId The unique string (ID) that is used to identify a hosted zone. 
   */
  public fun hostedZoneId(hostedZoneId: String) {
    cdkBuilder.hostedZoneId(hostedZoneId)
  }

  /**
   * The Amazon resource name (ARN) for a customer managed customer master key (CMK) in AWS Key
   * Management Service ( AWS KMS ).
   *
   * The `KeyManagementServiceArn` must be unique for each key-signing key (KSK) in a single hosted
   * zone. For example: `arn:aws:kms:us-east-1:111122223333:key/111a2222-a11b-1ab1-2ab2-1ab21a2b3a111`
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html#cfn-route53-keysigningkey-keymanagementservicearn)
   * @param keyManagementServiceArn The Amazon resource name (ARN) for a customer managed customer
   * master key (CMK) in AWS Key Management Service ( AWS KMS ). 
   */
  public fun keyManagementServiceArn(keyManagementServiceArn: String) {
    cdkBuilder.keyManagementServiceArn(keyManagementServiceArn)
  }

  /**
   * A string used to identify a key-signing key (KSK).
   *
   * `Name` can include numbers, letters, and underscores (_). `Name` must be unique for each
   * key-signing key in the same hosted zone.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html#cfn-route53-keysigningkey-name)
   * @param name A string used to identify a key-signing key (KSK). 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * A string that represents the current key-signing key (KSK) status.
   *
   * Status can have one of the following values:
   *
   * * **ACTIVE** - The KSK is being used for signing.
   * * **INACTIVE** - The KSK is not being used for signing.
   * * **DELETING** - The KSK is in the process of being deleted.
   * * **ACTION_NEEDED** - There is a problem with the KSK that requires you to take action to
   * resolve. For example, the customer managed key might have been deleted, or the permissions for the
   * customer managed key might have been changed.
   * * **INTERNAL_FAILURE** - There was an error during a request. Before you can continue to work
   * with DNSSEC signing, including actions that involve this KSK, you must correct the problem. For
   * example, you may need to activate or deactivate the KSK.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html#cfn-route53-keysigningkey-status)
   * @param status A string that represents the current key-signing key (KSK) status. 
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnKeySigningKey = cdkBuilder.build()
}
