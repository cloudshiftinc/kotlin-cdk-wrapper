package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAlias internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.kms.CfnAlias,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Specifies the alias name.
   *
   * This value must begin with `alias/` followed by a name, such as `alias/ExampleAlias` .
   */
  public open fun aliasName(): String = unwrap(this).getAliasName()

  /**
   * Specifies the alias name.
   *
   * This value must begin with `alias/` followed by a name, such as `alias/ExampleAlias` .
   */
  public open fun aliasName(`value`: String) {
    unwrap(this).setAliasName(`value`)
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
   * Associates the alias with the specified [customer managed
   * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk) . The KMS
   * key must be in the same AWS account and Region.
   */
  public open fun targetKeyId(): String = unwrap(this).getTargetKeyId()

  /**
   * Associates the alias with the specified [customer managed
   * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk) . The KMS
   * key must be in the same AWS account and Region.
   */
  public open fun targetKeyId(`value`: String) {
    unwrap(this).setTargetKeyId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kms.CfnAlias].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the alias name. This value must begin with `alias/` followed by a name, such as
     * `alias/ExampleAlias` .
     *
     *
     * If you change the value of the `AliasName` property, the existing alias is deleted and a new
     * alias is created for the specified KMS key. This change can disrupt applications that use the
     * alias. It can also allow or deny access to a KMS key affected by attribute-based access control
     * (ABAC).
     *
     *
     * The alias must be string of 1-256 characters. It can contain only alphanumeric characters,
     * forward slashes (/), underscores (_), and dashes (-). The alias name cannot begin with
     * `alias/aws/` . The `alias/aws/` prefix is reserved for [AWS managed
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html#cfn-kms-alias-aliasname)
     * @param aliasName Specifies the alias name. This value must begin with `alias/` followed by a
     * name, such as `alias/ExampleAlias` . 
     */
    public fun aliasName(aliasName: String)

    /**
     * Associates the alias with the specified [customer managed
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk) . The KMS
     * key must be in the same AWS account and Region.
     *
     * A valid key ID is required. If you supply a null or empty string value, this operation
     * returns an error.
     *
     * For help finding the key ID and ARN, see [Finding the key ID and
     * ARN](https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * Specify the key ID or the key ARN of the KMS key.
     *
     * For example:
     *
     * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Key ARN: `arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
     *
     * To get the key ID and key ARN for a KMS key, use
     * [ListKeys](https://docs.aws.amazon.com/kms/latest/APIReference/API_ListKeys.html) or
     * [DescribeKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html#cfn-kms-alias-targetkeyid)
     * @param targetKeyId Associates the alias with the specified [customer managed
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk) . The KMS
     * key must be in the same AWS account and Region. 
     */
    public fun targetKeyId(targetKeyId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.CfnAlias.Builder =
        software.amazon.awscdk.services.kms.CfnAlias.Builder.create(scope, id)

    /**
     * Specifies the alias name. This value must begin with `alias/` followed by a name, such as
     * `alias/ExampleAlias` .
     *
     *
     * If you change the value of the `AliasName` property, the existing alias is deleted and a new
     * alias is created for the specified KMS key. This change can disrupt applications that use the
     * alias. It can also allow or deny access to a KMS key affected by attribute-based access control
     * (ABAC).
     *
     *
     * The alias must be string of 1-256 characters. It can contain only alphanumeric characters,
     * forward slashes (/), underscores (_), and dashes (-). The alias name cannot begin with
     * `alias/aws/` . The `alias/aws/` prefix is reserved for [AWS managed
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html#cfn-kms-alias-aliasname)
     * @param aliasName Specifies the alias name. This value must begin with `alias/` followed by a
     * name, such as `alias/ExampleAlias` . 
     */
    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    /**
     * Associates the alias with the specified [customer managed
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk) . The KMS
     * key must be in the same AWS account and Region.
     *
     * A valid key ID is required. If you supply a null or empty string value, this operation
     * returns an error.
     *
     * For help finding the key ID and ARN, see [Finding the key ID and
     * ARN](https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * Specify the key ID or the key ARN of the KMS key.
     *
     * For example:
     *
     * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Key ARN: `arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
     *
     * To get the key ID and key ARN for a KMS key, use
     * [ListKeys](https://docs.aws.amazon.com/kms/latest/APIReference/API_ListKeys.html) or
     * [DescribeKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html#cfn-kms-alias-targetkeyid)
     * @param targetKeyId Associates the alias with the specified [customer managed
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk) . The KMS
     * key must be in the same AWS account and Region. 
     */
    override fun targetKeyId(targetKeyId: String) {
      cdkBuilder.targetKeyId(targetKeyId)
    }

    public fun build(): software.amazon.awscdk.services.kms.CfnAlias = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAlias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAlias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.CfnAlias): CfnAlias =
        CfnAlias(cdkObject)

    internal fun unwrap(wrapped: CfnAlias): software.amazon.awscdk.services.kms.CfnAlias =
        wrapped.cdkObject
  }
}
