@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Route53::KeySigningKey` resource creates a new key-signing key (KSK) in a hosted zone.
 *
 * The hosted zone ID is passed as a parameter in the KSK properties. You can specify the properties
 * of this KSK using the `Name` , `Status` , and `KeyManagementServiceArn` properties of the resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * CfnKeySigningKey cfnKeySigningKey = CfnKeySigningKey.Builder.create(this, "MyCfnKeySigningKey")
 * .hostedZoneId("hostedZoneId")
 * .keyManagementServiceArn("keyManagementServiceArn")
 * .name("name")
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html)
 */
public open class CfnKeySigningKey internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.route53.CfnKeySigningKey,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnKeySigningKeyProps,
  ) :
      this(software.amazon.awscdk.services.route53.CfnKeySigningKey(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnKeySigningKeyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnKeySigningKeyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnKeySigningKeyProps(props)
  )

  /**
   * The unique string (ID) that is used to identify a hosted zone.
   */
  public open fun hostedZoneId(): String = unwrap(this).getHostedZoneId()

  /**
   * The unique string (ID) that is used to identify a hosted zone.
   */
  public open fun hostedZoneId(`value`: String) {
    unwrap(this).setHostedZoneId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon resource name (ARN) for a customer managed customer master key (CMK) in AWS Key
   * Management Service ( AWS KMS ).
   */
  public open fun keyManagementServiceArn(): String = unwrap(this).getKeyManagementServiceArn()

  /**
   * The Amazon resource name (ARN) for a customer managed customer master key (CMK) in AWS Key
   * Management Service ( AWS KMS ).
   */
  public open fun keyManagementServiceArn(`value`: String) {
    unwrap(this).setKeyManagementServiceArn(`value`)
  }

  /**
   * A string used to identify a key-signing key (KSK).
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A string used to identify a key-signing key (KSK).
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A string that represents the current key-signing key (KSK) status.
   */
  public open fun status(): String = unwrap(this).getStatus()

  /**
   * A string that represents the current key-signing key (KSK) status.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53.CfnKeySigningKey].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique string (ID) that is used to identify a hosted zone.
     *
     * For example: `Z00001111A1ABCaaABC11` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html#cfn-route53-keysigningkey-hostedzoneid)
     * @param hostedZoneId The unique string (ID) that is used to identify a hosted zone. 
     */
    public fun hostedZoneId(hostedZoneId: String)

    /**
     * The Amazon resource name (ARN) for a customer managed customer master key (CMK) in AWS Key
     * Management Service ( AWS KMS ).
     *
     * The `KeyManagementServiceArn` must be unique for each key-signing key (KSK) in a single
     * hosted zone. For example:
     * `arn:aws:kms:us-east-1:111122223333:key/111a2222-a11b-1ab1-2ab2-1ab21a2b3a111` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html#cfn-route53-keysigningkey-keymanagementservicearn)
     * @param keyManagementServiceArn The Amazon resource name (ARN) for a customer managed customer
     * master key (CMK) in AWS Key Management Service ( AWS KMS ). 
     */
    public fun keyManagementServiceArn(keyManagementServiceArn: String)

    /**
     * A string used to identify a key-signing key (KSK).
     *
     * `Name` can include numbers, letters, and underscores (_). `Name` must be unique for each
     * key-signing key in the same hosted zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html#cfn-route53-keysigningkey-name)
     * @param name A string used to identify a key-signing key (KSK). 
     */
    public fun name(name: String)

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
     * @param status A string that represents the current key-signing key (KSK) status. 
     */
    public fun status(status: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnKeySigningKey.Builder =
        software.amazon.awscdk.services.route53.CfnKeySigningKey.Builder.create(scope, id)

    /**
     * The unique string (ID) that is used to identify a hosted zone.
     *
     * For example: `Z00001111A1ABCaaABC11` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html#cfn-route53-keysigningkey-hostedzoneid)
     * @param hostedZoneId The unique string (ID) that is used to identify a hosted zone. 
     */
    override fun hostedZoneId(hostedZoneId: String) {
      cdkBuilder.hostedZoneId(hostedZoneId)
    }

    /**
     * The Amazon resource name (ARN) for a customer managed customer master key (CMK) in AWS Key
     * Management Service ( AWS KMS ).
     *
     * The `KeyManagementServiceArn` must be unique for each key-signing key (KSK) in a single
     * hosted zone. For example:
     * `arn:aws:kms:us-east-1:111122223333:key/111a2222-a11b-1ab1-2ab2-1ab21a2b3a111` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html#cfn-route53-keysigningkey-keymanagementservicearn)
     * @param keyManagementServiceArn The Amazon resource name (ARN) for a customer managed customer
     * master key (CMK) in AWS Key Management Service ( AWS KMS ). 
     */
    override fun keyManagementServiceArn(keyManagementServiceArn: String) {
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
    override fun name(name: String) {
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
     * resolve. For example, the customer managed key might have been deleted, or the permissions for
     * the customer managed key might have been changed.
     * * **INTERNAL_FAILURE** - There was an error during a request. Before you can continue to work
     * with DNSSEC signing, including actions that involve this KSK, you must correct the problem. For
     * example, you may need to activate or deactivate the KSK.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-keysigningkey.html#cfn-route53-keysigningkey-status)
     * @param status A string that represents the current key-signing key (KSK) status. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.route53.CfnKeySigningKey =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53.CfnKeySigningKey.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnKeySigningKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnKeySigningKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnKeySigningKey):
        CfnKeySigningKey = CfnKeySigningKey(cdkObject)

    internal fun unwrap(wrapped: CfnKeySigningKey):
        software.amazon.awscdk.services.route53.CfnKeySigningKey = wrapped.cdkObject
  }
}
