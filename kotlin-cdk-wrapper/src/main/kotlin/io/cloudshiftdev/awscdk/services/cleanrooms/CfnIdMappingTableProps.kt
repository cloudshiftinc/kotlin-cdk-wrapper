@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnIdMappingTable`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
 * CfnIdMappingTableProps cfnIdMappingTableProps = CfnIdMappingTableProps.builder()
 * .inputReferenceConfig(IdMappingTableInputReferenceConfigProperty.builder()
 * .inputReferenceArn("inputReferenceArn")
 * .manageResourcePolicies(false)
 * .build())
 * .membershipIdentifier("membershipIdentifier")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .kmsKeyArn("kmsKeyArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html)
 */
public interface CfnIdMappingTableProps {
  /**
   * The description of the ID mapping table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The input reference configuration for the ID mapping table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-inputreferenceconfig)
   */
  public fun inputReferenceConfig(): Any

  /**
   * The Amazon Resource Name (ARN) of the AWS KMS key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-kmskeyarn)
   */
  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The unique identifier of the membership resource for the ID mapping table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-membershipidentifier)
   */
  public fun membershipIdentifier(): String

  /**
   * The name of the ID mapping table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-name)
   */
  public fun name(): String

  /**
   * An optional label that you can assign to a resource when you create it.
   *
   * Each tag consists of a key and an optional value, both of which you define. When you use
   * tagging, you can also use tag-based access control in IAM policies to control access to this
   * resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnIdMappingTableProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the ID mapping table.
     */
    public fun description(description: String)

    /**
     * @param inputReferenceConfig The input reference configuration for the ID mapping table. 
     */
    public fun inputReferenceConfig(inputReferenceConfig: IResolvable)

    /**
     * @param inputReferenceConfig The input reference configuration for the ID mapping table. 
     */
    public
        fun inputReferenceConfig(inputReferenceConfig: CfnIdMappingTable.IdMappingTableInputReferenceConfigProperty)

    /**
     * @param inputReferenceConfig The input reference configuration for the ID mapping table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47462f61f8583f200b9adf7c7eb5942edcef5c4bf950d4f503cd6993a1defe36")
    public
        fun inputReferenceConfig(inputReferenceConfig: CfnIdMappingTable.IdMappingTableInputReferenceConfigProperty.Builder.() -> Unit)

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS KMS key.
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * @param membershipIdentifier The unique identifier of the membership resource for the ID
     * mapping table. 
     */
    public fun membershipIdentifier(membershipIdentifier: String)

    /**
     * @param name The name of the ID mapping table. 
     */
    public fun name(name: String)

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cleanrooms.CfnIdMappingTableProps.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnIdMappingTableProps.builder()

    /**
     * @param description The description of the ID mapping table.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param inputReferenceConfig The input reference configuration for the ID mapping table. 
     */
    override fun inputReferenceConfig(inputReferenceConfig: IResolvable) {
      cdkBuilder.inputReferenceConfig(inputReferenceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param inputReferenceConfig The input reference configuration for the ID mapping table. 
     */
    override
        fun inputReferenceConfig(inputReferenceConfig: CfnIdMappingTable.IdMappingTableInputReferenceConfigProperty) {
      cdkBuilder.inputReferenceConfig(inputReferenceConfig.let(CfnIdMappingTable.IdMappingTableInputReferenceConfigProperty.Companion::unwrap))
    }

    /**
     * @param inputReferenceConfig The input reference configuration for the ID mapping table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47462f61f8583f200b9adf7c7eb5942edcef5c4bf950d4f503cd6993a1defe36")
    override
        fun inputReferenceConfig(inputReferenceConfig: CfnIdMappingTable.IdMappingTableInputReferenceConfigProperty.Builder.() -> Unit):
        Unit =
        inputReferenceConfig(CfnIdMappingTable.IdMappingTableInputReferenceConfigProperty(inputReferenceConfig))

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS KMS key.
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param membershipIdentifier The unique identifier of the membership resource for the ID
     * mapping table. 
     */
    override fun membershipIdentifier(membershipIdentifier: String) {
      cdkBuilder.membershipIdentifier(membershipIdentifier)
    }

    /**
     * @param name The name of the ID mapping table. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnIdMappingTableProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdMappingTableProps,
  ) : CdkObject(cdkObject),
      CfnIdMappingTableProps {
    /**
     * The description of the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The input reference configuration for the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-inputreferenceconfig)
     */
    override fun inputReferenceConfig(): Any = unwrap(this).getInputReferenceConfig()

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-kmskeyarn)
     */
    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The unique identifier of the membership resource for the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-membershipidentifier)
     */
    override fun membershipIdentifier(): String = unwrap(this).getMembershipIdentifier()

    /**
     * The name of the ID mapping table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-idmappingtable.html#cfn-cleanrooms-idmappingtable-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdMappingTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnIdMappingTableProps):
        CfnIdMappingTableProps = CdkObjectWrappers.wrap(cdkObject) as? CfnIdMappingTableProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIdMappingTableProps):
        software.amazon.awscdk.services.cleanrooms.CfnIdMappingTableProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cleanrooms.CfnIdMappingTableProps
  }
}
