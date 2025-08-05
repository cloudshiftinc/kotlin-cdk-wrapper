@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mpa

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new identity source.
 *
 * For more information, see [Identity
 * Source](https://docs.aws.amazon.com/mpa/latest/userguide/mpa-concepts.html) in the *Multi-party
 * approval User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mpa.*;
 * CfnIdentitySource cfnIdentitySource = CfnIdentitySource.Builder.create(this,
 * "MyCfnIdentitySource")
 * .identitySourceParameters(IdentitySourceParametersProperty.builder()
 * .iamIdentityCenter(IamIdentityCenterProperty.builder()
 * .instanceArn("instanceArn")
 * .region("region")
 * // the properties below are optional
 * .approvalPortalUrl("approvalPortalUrl")
 * .build())
 * .build())
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-identitysource.html)
 */
public open class CfnIdentitySource(
  cdkObject: software.amazon.awscdk.services.mpa.CfnIdentitySource,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIdentitySourceProps,
  ) :
      this(software.amazon.awscdk.services.mpa.CfnIdentitySource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnIdentitySourceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIdentitySourceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIdentitySourceProps(props)
  )

  /**
   * Timestamp when the identity source was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * Amazon Resource Name (ARN) for the identity source.
   */
  public open fun attrIdentitySourceArn(): String = unwrap(this).getAttrIdentitySourceArn()

  /**
   * URL for the approval portal associated with the IAM Identity Center instance.
   */
  public open fun attrIdentitySourceParametersIamIdentityCenterApprovalPortalUrl(): String =
      unwrap(this).getAttrIdentitySourceParametersIamIdentityCenterApprovalPortalUrl()

  /**
   * The type of resource that provided identities to the identity source.
   *
   * For example, an IAM Identity Center instance.
   */
  public open fun attrIdentitySourceType(): String = unwrap(this).getAttrIdentitySourceType()

  /**
   * Status for the identity source.
   *
   * For example, if the identity source is `ACTIVE` .
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Status code of the identity source.
   */
  public open fun attrStatusCode(): String = unwrap(this).getAttrStatusCode()

  /**
   * Message describing the status for the identity source.
   */
  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A `IdentitySourceParameters` object.
   */
  public open fun identitySourceParameters(): Any = unwrap(this).getIdentitySourceParameters()

  /**
   * A `IdentitySourceParameters` object.
   */
  public open fun identitySourceParameters(`value`: IResolvable) {
    unwrap(this).setIdentitySourceParameters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A `IdentitySourceParameters` object.
   */
  public open fun identitySourceParameters(`value`: IdentitySourceParametersProperty) {
    unwrap(this).setIdentitySourceParameters(`value`.let(IdentitySourceParametersProperty.Companion::unwrap))
  }

  /**
   * A `IdentitySourceParameters` object.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2bc7536a05e8a328198d3e9ad66f40d7f728be77ec61e589fe1e1c9d10860aae")
  public open
      fun identitySourceParameters(`value`: IdentitySourceParametersProperty.Builder.() -> Unit):
      Unit = identitySourceParameters(IdentitySourceParametersProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Tags that you have added to the specified resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Tags that you have added to the specified resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Tags that you have added to the specified resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mpa.CfnIdentitySource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A `IdentitySourceParameters` object.
     *
     * Contains details for the resource that provides identities to the identity source. For
     * example, an IAM Identity Center instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-identitysource.html#cfn-mpa-identitysource-identitysourceparameters)
     * @param identitySourceParameters A `IdentitySourceParameters` object. 
     */
    public fun identitySourceParameters(identitySourceParameters: IResolvable)

    /**
     * A `IdentitySourceParameters` object.
     *
     * Contains details for the resource that provides identities to the identity source. For
     * example, an IAM Identity Center instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-identitysource.html#cfn-mpa-identitysource-identitysourceparameters)
     * @param identitySourceParameters A `IdentitySourceParameters` object. 
     */
    public fun identitySourceParameters(identitySourceParameters: IdentitySourceParametersProperty)

    /**
     * A `IdentitySourceParameters` object.
     *
     * Contains details for the resource that provides identities to the identity source. For
     * example, an IAM Identity Center instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-identitysource.html#cfn-mpa-identitysource-identitysourceparameters)
     * @param identitySourceParameters A `IdentitySourceParameters` object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e655bad0a8947dceea5302567b6361b1daa478680e74131da96f03f5fa5489fb")
    public
        fun identitySourceParameters(identitySourceParameters: IdentitySourceParametersProperty.Builder.() -> Unit)

    /**
     * Tags that you have added to the specified resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-identitysource.html#cfn-mpa-identitysource-tags)
     * @param tags Tags that you have added to the specified resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags that you have added to the specified resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-identitysource.html#cfn-mpa-identitysource-tags)
     * @param tags Tags that you have added to the specified resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mpa.CfnIdentitySource.Builder =
        software.amazon.awscdk.services.mpa.CfnIdentitySource.Builder.create(scope, id)

    /**
     * A `IdentitySourceParameters` object.
     *
     * Contains details for the resource that provides identities to the identity source. For
     * example, an IAM Identity Center instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-identitysource.html#cfn-mpa-identitysource-identitysourceparameters)
     * @param identitySourceParameters A `IdentitySourceParameters` object. 
     */
    override fun identitySourceParameters(identitySourceParameters: IResolvable) {
      cdkBuilder.identitySourceParameters(identitySourceParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * A `IdentitySourceParameters` object.
     *
     * Contains details for the resource that provides identities to the identity source. For
     * example, an IAM Identity Center instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-identitysource.html#cfn-mpa-identitysource-identitysourceparameters)
     * @param identitySourceParameters A `IdentitySourceParameters` object. 
     */
    override
        fun identitySourceParameters(identitySourceParameters: IdentitySourceParametersProperty) {
      cdkBuilder.identitySourceParameters(identitySourceParameters.let(IdentitySourceParametersProperty.Companion::unwrap))
    }

    /**
     * A `IdentitySourceParameters` object.
     *
     * Contains details for the resource that provides identities to the identity source. For
     * example, an IAM Identity Center instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-identitysource.html#cfn-mpa-identitysource-identitysourceparameters)
     * @param identitySourceParameters A `IdentitySourceParameters` object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e655bad0a8947dceea5302567b6361b1daa478680e74131da96f03f5fa5489fb")
    override
        fun identitySourceParameters(identitySourceParameters: IdentitySourceParametersProperty.Builder.() -> Unit):
        Unit = identitySourceParameters(IdentitySourceParametersProperty(identitySourceParameters))

    /**
     * Tags that you have added to the specified resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-identitysource.html#cfn-mpa-identitysource-tags)
     * @param tags Tags that you have added to the specified resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Tags that you have added to the specified resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-identitysource.html#cfn-mpa-identitysource-tags)
     * @param tags Tags that you have added to the specified resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mpa.CfnIdentitySource = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mpa.CfnIdentitySource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIdentitySource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIdentitySource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mpa.CfnIdentitySource):
        CfnIdentitySource = CfnIdentitySource(cdkObject)

    internal fun unwrap(wrapped: CfnIdentitySource):
        software.amazon.awscdk.services.mpa.CfnIdentitySource = wrapped.cdkObject as
        software.amazon.awscdk.services.mpa.CfnIdentitySource
  }

  /**
   * AWS IAM Identity Center credentials.
   *
   * For more information see, [AWS IAM Identity
   * Center](https://docs.aws.amazon.com/identity-center/) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mpa.*;
   * IamIdentityCenterProperty iamIdentityCenterProperty = IamIdentityCenterProperty.builder()
   * .instanceArn("instanceArn")
   * .region("region")
   * // the properties below are optional
   * .approvalPortalUrl("approvalPortalUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-identitysource-iamidentitycenter.html)
   */
  public interface IamIdentityCenterProperty {
    /**
     * URL for the approval portal associated with the IAM Identity Center instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-identitysource-iamidentitycenter.html#cfn-mpa-identitysource-iamidentitycenter-approvalportalurl)
     */
    public fun approvalPortalUrl(): String? = unwrap(this).getApprovalPortalUrl()

    /**
     * Amazon Resource Name (ARN) for the IAM Identity Center instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-identitysource-iamidentitycenter.html#cfn-mpa-identitysource-iamidentitycenter-instancearn)
     */
    public fun instanceArn(): String

    /**
     * AWS Region where the IAM Identity Center instance is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-identitysource-iamidentitycenter.html#cfn-mpa-identitysource-iamidentitycenter-region)
     */
    public fun region(): String

    /**
     * A builder for [IamIdentityCenterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param approvalPortalUrl URL for the approval portal associated with the IAM Identity
       * Center instance.
       */
      public fun approvalPortalUrl(approvalPortalUrl: String)

      /**
       * @param instanceArn Amazon Resource Name (ARN) for the IAM Identity Center instance. 
       */
      public fun instanceArn(instanceArn: String)

      /**
       * @param region AWS Region where the IAM Identity Center instance is located. 
       */
      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mpa.CfnIdentitySource.IamIdentityCenterProperty.Builder =
          software.amazon.awscdk.services.mpa.CfnIdentitySource.IamIdentityCenterProperty.builder()

      /**
       * @param approvalPortalUrl URL for the approval portal associated with the IAM Identity
       * Center instance.
       */
      override fun approvalPortalUrl(approvalPortalUrl: String) {
        cdkBuilder.approvalPortalUrl(approvalPortalUrl)
      }

      /**
       * @param instanceArn Amazon Resource Name (ARN) for the IAM Identity Center instance. 
       */
      override fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
      }

      /**
       * @param region AWS Region where the IAM Identity Center instance is located. 
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.mpa.CfnIdentitySource.IamIdentityCenterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mpa.CfnIdentitySource.IamIdentityCenterProperty,
    ) : CdkObject(cdkObject),
        IamIdentityCenterProperty {
      /**
       * URL for the approval portal associated with the IAM Identity Center instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-identitysource-iamidentitycenter.html#cfn-mpa-identitysource-iamidentitycenter-approvalportalurl)
       */
      override fun approvalPortalUrl(): String? = unwrap(this).getApprovalPortalUrl()

      /**
       * Amazon Resource Name (ARN) for the IAM Identity Center instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-identitysource-iamidentitycenter.html#cfn-mpa-identitysource-iamidentitycenter-instancearn)
       */
      override fun instanceArn(): String = unwrap(this).getInstanceArn()

      /**
       * AWS Region where the IAM Identity Center instance is located.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-identitysource-iamidentitycenter.html#cfn-mpa-identitysource-iamidentitycenter-region)
       */
      override fun region(): String = unwrap(this).getRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IamIdentityCenterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mpa.CfnIdentitySource.IamIdentityCenterProperty):
          IamIdentityCenterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IamIdentityCenterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IamIdentityCenterProperty):
          software.amazon.awscdk.services.mpa.CfnIdentitySource.IamIdentityCenterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.mpa.CfnIdentitySource.IamIdentityCenterProperty
    }
  }

  /**
   * Contains details for the resource that provides identities to the identity source.
   *
   * For example, an IAM Identity Center instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mpa.*;
   * IdentitySourceParametersProperty identitySourceParametersProperty =
   * IdentitySourceParametersProperty.builder()
   * .iamIdentityCenter(IamIdentityCenterProperty.builder()
   * .instanceArn("instanceArn")
   * .region("region")
   * // the properties below are optional
   * .approvalPortalUrl("approvalPortalUrl")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-identitysource-identitysourceparameters.html)
   */
  public interface IdentitySourceParametersProperty {
    /**
     * AWS IAM Identity Center credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-identitysource-identitysourceparameters.html#cfn-mpa-identitysource-identitysourceparameters-iamidentitycenter)
     */
    public fun iamIdentityCenter(): Any

    /**
     * A builder for [IdentitySourceParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param iamIdentityCenter AWS IAM Identity Center credentials. 
       */
      public fun iamIdentityCenter(iamIdentityCenter: IResolvable)

      /**
       * @param iamIdentityCenter AWS IAM Identity Center credentials. 
       */
      public fun iamIdentityCenter(iamIdentityCenter: IamIdentityCenterProperty)

      /**
       * @param iamIdentityCenter AWS IAM Identity Center credentials. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00b4592c3654bff42d4a1ffc2a250fb13a8e48f9fcd1fc00bfef6e88bebf59ba")
      public fun iamIdentityCenter(iamIdentityCenter: IamIdentityCenterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mpa.CfnIdentitySource.IdentitySourceParametersProperty.Builder
          =
          software.amazon.awscdk.services.mpa.CfnIdentitySource.IdentitySourceParametersProperty.builder()

      /**
       * @param iamIdentityCenter AWS IAM Identity Center credentials. 
       */
      override fun iamIdentityCenter(iamIdentityCenter: IResolvable) {
        cdkBuilder.iamIdentityCenter(iamIdentityCenter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param iamIdentityCenter AWS IAM Identity Center credentials. 
       */
      override fun iamIdentityCenter(iamIdentityCenter: IamIdentityCenterProperty) {
        cdkBuilder.iamIdentityCenter(iamIdentityCenter.let(IamIdentityCenterProperty.Companion::unwrap))
      }

      /**
       * @param iamIdentityCenter AWS IAM Identity Center credentials. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00b4592c3654bff42d4a1ffc2a250fb13a8e48f9fcd1fc00bfef6e88bebf59ba")
      override
          fun iamIdentityCenter(iamIdentityCenter: IamIdentityCenterProperty.Builder.() -> Unit):
          Unit = iamIdentityCenter(IamIdentityCenterProperty(iamIdentityCenter))

      public fun build():
          software.amazon.awscdk.services.mpa.CfnIdentitySource.IdentitySourceParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mpa.CfnIdentitySource.IdentitySourceParametersProperty,
    ) : CdkObject(cdkObject),
        IdentitySourceParametersProperty {
      /**
       * AWS IAM Identity Center credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-identitysource-identitysourceparameters.html#cfn-mpa-identitysource-identitysourceparameters-iamidentitycenter)
       */
      override fun iamIdentityCenter(): Any = unwrap(this).getIamIdentityCenter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IdentitySourceParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mpa.CfnIdentitySource.IdentitySourceParametersProperty):
          IdentitySourceParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IdentitySourceParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdentitySourceParametersProperty):
          software.amazon.awscdk.services.mpa.CfnIdentitySource.IdentitySourceParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mpa.CfnIdentitySource.IdentitySourceParametersProperty
    }
  }
}
