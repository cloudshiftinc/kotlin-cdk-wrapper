@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnKeySigningKey`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * CfnKeySigningKeyProps cfnKeySigningKeyProps = CfnKeySigningKeyProps.builder()
 * .hostedZoneId("hostedZoneId")
 * .keyManagementServiceArn("keyManagementServiceArn")
 * .name("name")
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html)
 */
public interface CfnKeySigningKeyProps {
  /**
   * The unique string (ID) that is used to identify a hosted zone.
   *
   * For example: `Z00001111A1ABCaaABC11` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html#cfn-route53-keysigningkey-hostedzoneid)
   */
  public fun hostedZoneId(): String

  /**
   * The Amazon resource name (ARN) for a customer managed customer master key (CMK) in AWS Key
   * Management Service ( AWS KMS ).
   *
   * The `KeyManagementServiceArn` must be unique for each key-signing key (KSK) in a single hosted
   * zone. For example: `arn:aws:kms:us-east-1:111122223333:key/111a2222-a11b-1ab1-2ab2-1ab21a2b3a111`
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html#cfn-route53-keysigningkey-keymanagementservicearn)
   */
  public fun keyManagementServiceArn(): String

  /**
   * A string used to identify a key-signing key (KSK).
   *
   * `Name` can include numbers, letters, and underscores (_). `Name` must be unique for each
   * key-signing key in the same hosted zone.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html#cfn-route53-keysigningkey-name)
   */
  public fun name(): String

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
   */
  public fun status(): String

  /**
   * A builder for [CfnKeySigningKeyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param hostedZoneId The unique string (ID) that is used to identify a hosted zone. 
     * For example: `Z00001111A1ABCaaABC11` .
     */
    public fun hostedZoneId(hostedZoneId: String)

    /**
     * @param keyManagementServiceArn The Amazon resource name (ARN) for a customer managed customer
     * master key (CMK) in AWS Key Management Service ( AWS KMS ). 
     * The `KeyManagementServiceArn` must be unique for each key-signing key (KSK) in a single
     * hosted zone. For example:
     * `arn:aws:kms:us-east-1:111122223333:key/111a2222-a11b-1ab1-2ab2-1ab21a2b3a111` .
     */
    public fun keyManagementServiceArn(keyManagementServiceArn: String)

    /**
     * @param name A string used to identify a key-signing key (KSK). 
     * `Name` can include numbers, letters, and underscores (_). `Name` must be unique for each
     * key-signing key in the same hosted zone.
     */
    public fun name(name: String)

    /**
     * @param status A string that represents the current key-signing key (KSK) status. 
     * Status can have one of the following values:
     *
     * * **ACTIVE** - The KSK is being used for signing.
     * * **INACTIVE** - The KSK is not being used for signing.
     * * **DELETING** - The KSK is in the process of being deleted.
     * * **ACTION_NEEDED** - There is a problem with the KSK that requires you to take action to
     * resolve. For example, the customer managed key might have been deleted, or the permissions for
     * the customer managed key might have been changed.
     * * **INTERNAL_FAILURE** - There was an error during a request. Before you can continue to work
     * with DNSSEC signing, including actions that involve this KSK, you must correct the problem. For
     * example, you may need to activate or deactivate the KSK.
     */
    public fun status(status: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnKeySigningKeyProps.Builder =
        software.amazon.awscdk.services.route53.CfnKeySigningKeyProps.builder()

    /**
     * @param hostedZoneId The unique string (ID) that is used to identify a hosted zone. 
     * For example: `Z00001111A1ABCaaABC11` .
     */
    override fun hostedZoneId(hostedZoneId: String) {
      cdkBuilder.hostedZoneId(hostedZoneId)
    }

    /**
     * @param keyManagementServiceArn The Amazon resource name (ARN) for a customer managed customer
     * master key (CMK) in AWS Key Management Service ( AWS KMS ). 
     * The `KeyManagementServiceArn` must be unique for each key-signing key (KSK) in a single
     * hosted zone. For example:
     * `arn:aws:kms:us-east-1:111122223333:key/111a2222-a11b-1ab1-2ab2-1ab21a2b3a111` .
     */
    override fun keyManagementServiceArn(keyManagementServiceArn: String) {
      cdkBuilder.keyManagementServiceArn(keyManagementServiceArn)
    }

    /**
     * @param name A string used to identify a key-signing key (KSK). 
     * `Name` can include numbers, letters, and underscores (_). `Name` must be unique for each
     * key-signing key in the same hosted zone.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param status A string that represents the current key-signing key (KSK) status. 
     * Status can have one of the following values:
     *
     * * **ACTIVE** - The KSK is being used for signing.
     * * **INACTIVE** - The KSK is not being used for signing.
     * * **DELETING** - The KSK is in the process of being deleted.
     * * **ACTION_NEEDED** - There is a problem with the KSK that requires you to take action to
     * resolve. For example, the customer managed key might have been deleted, or the permissions for
     * the customer managed key might have been changed.
     * * **INTERNAL_FAILURE** - There was an error during a request. Before you can continue to work
     * with DNSSEC signing, including actions that involve this KSK, you must correct the problem. For
     * example, you may need to activate or deactivate the KSK.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.route53.CfnKeySigningKeyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53.CfnKeySigningKeyProps,
  ) : CdkObject(cdkObject), CfnKeySigningKeyProps {
    /**
     * The unique string (ID) that is used to identify a hosted zone.
     *
     * For example: `Z00001111A1ABCaaABC11` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html#cfn-route53-keysigningkey-hostedzoneid)
     */
    override fun hostedZoneId(): String = unwrap(this).getHostedZoneId()

    /**
     * The Amazon resource name (ARN) for a customer managed customer master key (CMK) in AWS Key
     * Management Service ( AWS KMS ).
     *
     * The `KeyManagementServiceArn` must be unique for each key-signing key (KSK) in a single
     * hosted zone. For example:
     * `arn:aws:kms:us-east-1:111122223333:key/111a2222-a11b-1ab1-2ab2-1ab21a2b3a111` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html#cfn-route53-keysigningkey-keymanagementservicearn)
     */
    override fun keyManagementServiceArn(): String = unwrap(this).getKeyManagementServiceArn()

    /**
     * A string used to identify a key-signing key (KSK).
     *
     * `Name` can include numbers, letters, and underscores (_). `Name` must be unique for each
     * key-signing key in the same hosted zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html#cfn-route53-keysigningkey-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A string that represents the current key-signing key (KSK) status.
     *
     * Status can have one of the following values:
     *
     * * **ACTIVE** - The KSK is being used for signing.
     * * **INACTIVE** - The KSK is not being used for signing.
     * * **DELETING** - The KSK is in the process of being deleted.
     * * **ACTION_NEEDED** - There is a problem with the KSK that requires you to take action to
     * resolve. For example, the customer managed key might have been deleted, or the permissions for
     * the customer managed key might have been changed.
     * * **INTERNAL_FAILURE** - There was an error during a request. Before you can continue to work
     * with DNSSEC signing, including actions that involve this KSK, you must correct the problem. For
     * example, you may need to activate or deactivate the KSK.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html#cfn-route53-keysigningkey-status)
     */
    override fun status(): String = unwrap(this).getStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnKeySigningKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnKeySigningKeyProps):
        CfnKeySigningKeyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnKeySigningKeyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnKeySigningKeyProps):
        software.amazon.awscdk.services.route53.CfnKeySigningKeyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.CfnKeySigningKeyProps
  }
}
