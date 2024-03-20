@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An AWS Verified Access group is a collection of AWS Verified Access endpoints who's associated
 * applications have similar security requirements.
 *
 * Each instance within a Verified Access group shares an Verified Access policy. For example, you
 * can group all Verified Access instances associated with "sales" applications together and use one
 * common Verified Access policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVerifiedAccessGroup cfnVerifiedAccessGroup = CfnVerifiedAccessGroup.Builder.create(this,
 * "MyCfnVerifiedAccessGroup")
 * .verifiedAccessInstanceId("verifiedAccessInstanceId")
 * // the properties below are optional
 * .description("description")
 * .policyDocument("policyDocument")
 * .policyEnabled(false)
 * .sseSpecification(SseSpecificationProperty.builder()
 * .customerManagedKeyEnabled(false)
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html)
 */
public open class CfnVerifiedAccessGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVerifiedAccessGroupProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnVerifiedAccessGroupProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVerifiedAccessGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVerifiedAccessGroupProps(props)
  )

  /**
   * The creation time.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The last updated time.
   */
  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  /**
   * The ID of the AWS account that owns the group.
   */
  public open fun attrOwner(): String = unwrap(this).getAttrOwner()

  /**
   * The ARN of the Verified Access group.
   */
  public open fun attrVerifiedAccessGroupArn(): String =
      unwrap(this).getAttrVerifiedAccessGroupArn()

  /**
   * The ID of the Verified Access group.
   */
  public open fun attrVerifiedAccessGroupId(): String = unwrap(this).getAttrVerifiedAccessGroupId()

  /**
   * A description for the AWS Verified Access group.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the AWS Verified Access group.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * The Verified Access policy document.
   */
  public open fun policyDocument(): String? = unwrap(this).getPolicyDocument()

  /**
   * The Verified Access policy document.
   */
  public open fun policyDocument(`value`: String) {
    unwrap(this).setPolicyDocument(`value`)
  }

  /**
   * The status of the Verified Access policy.
   */
  public open fun policyEnabled(): Any? = unwrap(this).getPolicyEnabled()

  /**
   * The status of the Verified Access policy.
   */
  public open fun policyEnabled(`value`: Boolean) {
    unwrap(this).setPolicyEnabled(`value`)
  }

  /**
   * The status of the Verified Access policy.
   */
  public open fun policyEnabled(`value`: IResolvable) {
    unwrap(this).setPolicyEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * The options for additional server side encryption.
   */
  public open fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  /**
   * The options for additional server side encryption.
   */
  public open fun sseSpecification(`value`: IResolvable) {
    unwrap(this).setSseSpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   * The options for additional server side encryption.
   */
  public open fun sseSpecification(`value`: SseSpecificationProperty) {
    unwrap(this).setSseSpecification(`value`.let(SseSpecificationProperty::unwrap))
  }

  /**
   * The options for additional server side encryption.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("45cdfe29f25455bca600e9bf5b7b542b3d8f545e9bb2500df14674db74279be5")
  public open fun sseSpecification(`value`: SseSpecificationProperty.Builder.() -> Unit): Unit =
      sseSpecification(SseSpecificationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the AWS Verified Access instance.
   */
  public open fun verifiedAccessInstanceId(): String = unwrap(this).getVerifiedAccessInstanceId()

  /**
   * The ID of the AWS Verified Access instance.
   */
  public open fun verifiedAccessInstanceId(`value`: String) {
    unwrap(this).setVerifiedAccessInstanceId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVerifiedAccessGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description for the AWS Verified Access group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-description)
     * @param description A description for the AWS Verified Access group. 
     */
    public fun description(description: String)

    /**
     * The Verified Access policy document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-policydocument)
     * @param policyDocument The Verified Access policy document. 
     */
    public fun policyDocument(policyDocument: String)

    /**
     * The status of the Verified Access policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-policyenabled)
     * @param policyEnabled The status of the Verified Access policy. 
     */
    public fun policyEnabled(policyEnabled: Boolean)

    /**
     * The status of the Verified Access policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-policyenabled)
     * @param policyEnabled The status of the Verified Access policy. 
     */
    public fun policyEnabled(policyEnabled: IResolvable)

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-ssespecification)
     * @param sseSpecification The options for additional server side encryption. 
     */
    public fun sseSpecification(sseSpecification: IResolvable)

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-ssespecification)
     * @param sseSpecification The options for additional server side encryption. 
     */
    public fun sseSpecification(sseSpecification: SseSpecificationProperty)

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-ssespecification)
     * @param sseSpecification The options for additional server side encryption. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f60a3a4d6c62fc065963b9fee159523f4c390b096d88be623010b2d68d950fbe")
    public fun sseSpecification(sseSpecification: SseSpecificationProperty.Builder.() -> Unit)

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-tags)
     * @param tags The tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-tags)
     * @param tags The tags. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the AWS Verified Access instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-verifiedaccessinstanceid)
     * @param verifiedAccessInstanceId The ID of the AWS Verified Access instance. 
     */
    public fun verifiedAccessInstanceId(verifiedAccessInstanceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup.Builder =
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup.Builder.create(scope, id)

    /**
     * A description for the AWS Verified Access group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-description)
     * @param description A description for the AWS Verified Access group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Verified Access policy document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-policydocument)
     * @param policyDocument The Verified Access policy document. 
     */
    override fun policyDocument(policyDocument: String) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * The status of the Verified Access policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-policyenabled)
     * @param policyEnabled The status of the Verified Access policy. 
     */
    override fun policyEnabled(policyEnabled: Boolean) {
      cdkBuilder.policyEnabled(policyEnabled)
    }

    /**
     * The status of the Verified Access policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-policyenabled)
     * @param policyEnabled The status of the Verified Access policy. 
     */
    override fun policyEnabled(policyEnabled: IResolvable) {
      cdkBuilder.policyEnabled(policyEnabled.let(IResolvable::unwrap))
    }

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-ssespecification)
     * @param sseSpecification The options for additional server side encryption. 
     */
    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-ssespecification)
     * @param sseSpecification The options for additional server side encryption. 
     */
    override fun sseSpecification(sseSpecification: SseSpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(SseSpecificationProperty::unwrap))
    }

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-ssespecification)
     * @param sseSpecification The options for additional server side encryption. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f60a3a4d6c62fc065963b9fee159523f4c390b096d88be623010b2d68d950fbe")
    override fun sseSpecification(sseSpecification: SseSpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(SseSpecificationProperty(sseSpecification))

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-tags)
     * @param tags The tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-tags)
     * @param tags The tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the AWS Verified Access instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-verifiedaccessinstanceid)
     * @param verifiedAccessInstanceId The ID of the AWS Verified Access instance. 
     */
    override fun verifiedAccessInstanceId(verifiedAccessInstanceId: String) {
      cdkBuilder.verifiedAccessInstanceId(verifiedAccessInstanceId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVerifiedAccessGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVerifiedAccessGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup):
        CfnVerifiedAccessGroup = CfnVerifiedAccessGroup(cdkObject)

    internal fun unwrap(wrapped: CfnVerifiedAccessGroup):
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup = wrapped.cdkObject
  }

  /**
   * AWS Verified Access provides server side encryption by default to data at rest using AWS -owned
   * KMS keys.
   *
   * You also have the option of using customer managed KMS keys, which can be specified using the
   * options below.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * SseSpecificationProperty sseSpecificationProperty = SseSpecificationProperty.builder()
   * .customerManagedKeyEnabled(false)
   * .kmsKeyArn("kmsKeyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessgroup-ssespecification.html)
   */
  public interface SseSpecificationProperty {
    /**
     * Enable or disable the use of customer managed KMS keys for server side encryption.
     *
     * Valid values: `True` | `False`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessgroup-ssespecification.html#cfn-ec2-verifiedaccessgroup-ssespecification-customermanagedkeyenabled)
     */
    public fun customerManagedKeyEnabled(): Any? = unwrap(this).getCustomerManagedKeyEnabled()

    /**
     * The ARN of the KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessgroup-ssespecification.html#cfn-ec2-verifiedaccessgroup-ssespecification-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * A builder for [SseSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customerManagedKeyEnabled Enable or disable the use of customer managed KMS keys for
       * server side encryption.
       * Valid values: `True` | `False`
       */
      public fun customerManagedKeyEnabled(customerManagedKeyEnabled: Boolean)

      /**
       * @param customerManagedKeyEnabled Enable or disable the use of customer managed KMS keys for
       * server side encryption.
       * Valid values: `True` | `False`
       */
      public fun customerManagedKeyEnabled(customerManagedKeyEnabled: IResolvable)

      /**
       * @param kmsKeyArn The ARN of the KMS key.
       */
      public fun kmsKeyArn(kmsKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup.SseSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup.SseSpecificationProperty.builder()

      /**
       * @param customerManagedKeyEnabled Enable or disable the use of customer managed KMS keys for
       * server side encryption.
       * Valid values: `True` | `False`
       */
      override fun customerManagedKeyEnabled(customerManagedKeyEnabled: Boolean) {
        cdkBuilder.customerManagedKeyEnabled(customerManagedKeyEnabled)
      }

      /**
       * @param customerManagedKeyEnabled Enable or disable the use of customer managed KMS keys for
       * server side encryption.
       * Valid values: `True` | `False`
       */
      override fun customerManagedKeyEnabled(customerManagedKeyEnabled: IResolvable) {
        cdkBuilder.customerManagedKeyEnabled(customerManagedKeyEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param kmsKeyArn The ARN of the KMS key.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup.SseSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup.SseSpecificationProperty,
    ) : CdkObject(cdkObject), SseSpecificationProperty {
      /**
       * Enable or disable the use of customer managed KMS keys for server side encryption.
       *
       * Valid values: `True` | `False`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessgroup-ssespecification.html#cfn-ec2-verifiedaccessgroup-ssespecification-customermanagedkeyenabled)
       */
      override fun customerManagedKeyEnabled(): Any? = unwrap(this).getCustomerManagedKeyEnabled()

      /**
       * The ARN of the KMS key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessgroup-ssespecification.html#cfn-ec2-verifiedaccessgroup-ssespecification-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SseSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup.SseSpecificationProperty):
          SseSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as? SseSpecificationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SseSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup.SseSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup.SseSpecificationProperty
    }
  }
}
