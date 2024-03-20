@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.b2bi

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
 * Instantiates a capability based on the specified parameters.
 *
 * A trading capability contains the information required to transform incoming EDI documents into
 * JSON or XML outputs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.b2bi.*;
 * CfnCapability cfnCapability = CfnCapability.Builder.create(this, "MyCfnCapability")
 * .configuration(CapabilityConfigurationProperty.builder()
 * .edi(EdiConfigurationProperty.builder()
 * .inputLocation(S3LocationProperty.builder()
 * .bucketName("bucketName")
 * .key("key")
 * .build())
 * .outputLocation(S3LocationProperty.builder()
 * .bucketName("bucketName")
 * .key("key")
 * .build())
 * .transformerId("transformerId")
 * .type(EdiTypeProperty.builder()
 * .x12Details(X12DetailsProperty.builder()
 * .transactionSet("transactionSet")
 * .version("version")
 * .build())
 * .build())
 * .build())
 * .build())
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .instructionsDocuments(List.of(S3LocationProperty.builder()
 * .bucketName("bucketName")
 * .key("key")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html)
 */
public open class CfnCapability internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCapabilityProps,
  ) :
      this(software.amazon.awscdk.services.b2bi.CfnCapability(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnCapabilityProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCapabilityProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCapabilityProps(props)
  )

  /**
   * Returns an Amazon Resource Name (ARN) for a specific AWS resource, such as a capability,
   * partnership, profile, or transformer.
   */
  public open fun attrCapabilityArn(): String = unwrap(this).getAttrCapabilityArn()

  /**
   * Returns a system-assigned unique identifier for the capability.
   */
  public open fun attrCapabilityId(): String = unwrap(this).getAttrCapabilityId()

  /**
   * Returns a timestamp for creation date and time of the capability.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * Returns a timestamp that identifies the most recent date and time that the capability was
   * modified.
   */
  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Specifies a structure that contains the details for a capability.
   */
  public open fun configuration(): Any = unwrap(this).getConfiguration()

  /**
   * Specifies a structure that contains the details for a capability.
   */
  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies a structure that contains the details for a capability.
   */
  public open fun configuration(`value`: CapabilityConfigurationProperty) {
    unwrap(this).setConfiguration(`value`.let(CapabilityConfigurationProperty::unwrap))
  }

  /**
   * Specifies a structure that contains the details for a capability.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e4a5807f71764d3387a6a1c9b4c5f682b57c11e7981b22c92c1103958c6d99c9")
  public open fun configuration(`value`: CapabilityConfigurationProperty.Builder.() -> Unit): Unit =
      configuration(CapabilityConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies one or more locations in Amazon S3, each specifying an EDI document that can be used
   * with this capability.
   */
  public open fun instructionsDocuments(): Any? = unwrap(this).getInstructionsDocuments()

  /**
   * Specifies one or more locations in Amazon S3, each specifying an EDI document that can be used
   * with this capability.
   */
  public open fun instructionsDocuments(`value`: IResolvable) {
    unwrap(this).setInstructionsDocuments(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies one or more locations in Amazon S3, each specifying an EDI document that can be used
   * with this capability.
   */
  public open fun instructionsDocuments(`value`: List<Any>) {
    unwrap(this).setInstructionsDocuments(`value`)
  }

  /**
   * Specifies one or more locations in Amazon S3, each specifying an EDI document that can be used
   * with this capability.
   */
  public open fun instructionsDocuments(vararg `value`: Any): Unit =
      instructionsDocuments(`value`.toList())

  /**
   * The display name of the capability.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The display name of the capability.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specifies the key-value pairs assigned to ARNs that you can use to group and search for
   * resources by type.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies the key-value pairs assigned to ARNs that you can use to group and search for
   * resources by type.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * Specifies the key-value pairs assigned to ARNs that you can use to group and search for
   * resources by type.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * Returns the type of the capability.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * Returns the type of the capability.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.b2bi.CfnCapability].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies a structure that contains the details for a capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-configuration)
     * @param configuration Specifies a structure that contains the details for a capability. 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * Specifies a structure that contains the details for a capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-configuration)
     * @param configuration Specifies a structure that contains the details for a capability. 
     */
    public fun configuration(configuration: CapabilityConfigurationProperty)

    /**
     * Specifies a structure that contains the details for a capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-configuration)
     * @param configuration Specifies a structure that contains the details for a capability. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53c3559d53849f639cc9f05cf1c37555296d5a8cb869318f56e0676c5c793f81")
    public fun configuration(configuration: CapabilityConfigurationProperty.Builder.() -> Unit)

    /**
     * Specifies one or more locations in Amazon S3, each specifying an EDI document that can be
     * used with this capability.
     *
     * Each item contains the name of the bucket and the key, to identify the document's location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-instructionsdocuments)
     * @param instructionsDocuments Specifies one or more locations in Amazon S3, each specifying an
     * EDI document that can be used with this capability. 
     */
    public fun instructionsDocuments(instructionsDocuments: IResolvable)

    /**
     * Specifies one or more locations in Amazon S3, each specifying an EDI document that can be
     * used with this capability.
     *
     * Each item contains the name of the bucket and the key, to identify the document's location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-instructionsdocuments)
     * @param instructionsDocuments Specifies one or more locations in Amazon S3, each specifying an
     * EDI document that can be used with this capability. 
     */
    public fun instructionsDocuments(instructionsDocuments: List<Any>)

    /**
     * Specifies one or more locations in Amazon S3, each specifying an EDI document that can be
     * used with this capability.
     *
     * Each item contains the name of the bucket and the key, to identify the document's location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-instructionsdocuments)
     * @param instructionsDocuments Specifies one or more locations in Amazon S3, each specifying an
     * EDI document that can be used with this capability. 
     */
    public fun instructionsDocuments(vararg instructionsDocuments: Any)

    /**
     * The display name of the capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-name)
     * @param name The display name of the capability. 
     */
    public fun name(name: String)

    /**
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for
     * resources by type.
     *
     * You can attach this metadata to resources (capabilities, partnerships, and so on) for any
     * purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-tags)
     * @param tags Specifies the key-value pairs assigned to ARNs that you can use to group and
     * search for resources by type. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for
     * resources by type.
     *
     * You can attach this metadata to resources (capabilities, partnerships, and so on) for any
     * purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-tags)
     * @param tags Specifies the key-value pairs assigned to ARNs that you can use to group and
     * search for resources by type. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Returns the type of the capability.
     *
     * Currently, only `edi` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-type)
     * @param type Returns the type of the capability. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.b2bi.CfnCapability.Builder =
        software.amazon.awscdk.services.b2bi.CfnCapability.Builder.create(scope, id)

    /**
     * Specifies a structure that contains the details for a capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-configuration)
     * @param configuration Specifies a structure that contains the details for a capability. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    /**
     * Specifies a structure that contains the details for a capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-configuration)
     * @param configuration Specifies a structure that contains the details for a capability. 
     */
    override fun configuration(configuration: CapabilityConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CapabilityConfigurationProperty::unwrap))
    }

    /**
     * Specifies a structure that contains the details for a capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-configuration)
     * @param configuration Specifies a structure that contains the details for a capability. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53c3559d53849f639cc9f05cf1c37555296d5a8cb869318f56e0676c5c793f81")
    override fun configuration(configuration: CapabilityConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CapabilityConfigurationProperty(configuration))

    /**
     * Specifies one or more locations in Amazon S3, each specifying an EDI document that can be
     * used with this capability.
     *
     * Each item contains the name of the bucket and the key, to identify the document's location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-instructionsdocuments)
     * @param instructionsDocuments Specifies one or more locations in Amazon S3, each specifying an
     * EDI document that can be used with this capability. 
     */
    override fun instructionsDocuments(instructionsDocuments: IResolvable) {
      cdkBuilder.instructionsDocuments(instructionsDocuments.let(IResolvable::unwrap))
    }

    /**
     * Specifies one or more locations in Amazon S3, each specifying an EDI document that can be
     * used with this capability.
     *
     * Each item contains the name of the bucket and the key, to identify the document's location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-instructionsdocuments)
     * @param instructionsDocuments Specifies one or more locations in Amazon S3, each specifying an
     * EDI document that can be used with this capability. 
     */
    override fun instructionsDocuments(instructionsDocuments: List<Any>) {
      cdkBuilder.instructionsDocuments(instructionsDocuments)
    }

    /**
     * Specifies one or more locations in Amazon S3, each specifying an EDI document that can be
     * used with this capability.
     *
     * Each item contains the name of the bucket and the key, to identify the document's location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-instructionsdocuments)
     * @param instructionsDocuments Specifies one or more locations in Amazon S3, each specifying an
     * EDI document that can be used with this capability. 
     */
    override fun instructionsDocuments(vararg instructionsDocuments: Any): Unit =
        instructionsDocuments(instructionsDocuments.toList())

    /**
     * The display name of the capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-name)
     * @param name The display name of the capability. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for
     * resources by type.
     *
     * You can attach this metadata to resources (capabilities, partnerships, and so on) for any
     * purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-tags)
     * @param tags Specifies the key-value pairs assigned to ARNs that you can use to group and
     * search for resources by type. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for
     * resources by type.
     *
     * You can attach this metadata to resources (capabilities, partnerships, and so on) for any
     * purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-tags)
     * @param tags Specifies the key-value pairs assigned to ARNs that you can use to group and
     * search for resources by type. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Returns the type of the capability.
     *
     * Currently, only `edi` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-type)
     * @param type Returns the type of the capability. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.b2bi.CfnCapability = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.b2bi.CfnCapability.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCapability {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCapability(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability): CfnCapability
        = CfnCapability(cdkObject)

    internal fun unwrap(wrapped: CfnCapability): software.amazon.awscdk.services.b2bi.CfnCapability
        = wrapped.cdkObject
  }

  /**
   * A capability object.
   *
   * Currently, only EDI (electronic data interchange) capabilities are supported. A trading
   * capability contains the information required to transform incoming EDI documents into JSON or XML
   * outputs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * CapabilityConfigurationProperty capabilityConfigurationProperty =
   * CapabilityConfigurationProperty.builder()
   * .edi(EdiConfigurationProperty.builder()
   * .inputLocation(S3LocationProperty.builder()
   * .bucketName("bucketName")
   * .key("key")
   * .build())
   * .outputLocation(S3LocationProperty.builder()
   * .bucketName("bucketName")
   * .key("key")
   * .build())
   * .transformerId("transformerId")
   * .type(EdiTypeProperty.builder()
   * .x12Details(X12DetailsProperty.builder()
   * .transactionSet("transactionSet")
   * .version("version")
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-capabilityconfiguration.html)
   */
  public interface CapabilityConfigurationProperty {
    /**
     * An EDI (electronic data interchange) configuration object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-capabilityconfiguration.html#cfn-b2bi-capability-capabilityconfiguration-edi)
     */
    public fun edi(): Any

    /**
     * A builder for [CapabilityConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param edi An EDI (electronic data interchange) configuration object. 
       */
      public fun edi(edi: IResolvable)

      /**
       * @param edi An EDI (electronic data interchange) configuration object. 
       */
      public fun edi(edi: EdiConfigurationProperty)

      /**
       * @param edi An EDI (electronic data interchange) configuration object. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94d8f4fe2c5f0410e138a92ce9520289809defd53587b984a78e7511307ad324")
      public fun edi(edi: EdiConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnCapability.CapabilityConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.b2bi.CfnCapability.CapabilityConfigurationProperty.builder()

      /**
       * @param edi An EDI (electronic data interchange) configuration object. 
       */
      override fun edi(edi: IResolvable) {
        cdkBuilder.edi(edi.let(IResolvable::unwrap))
      }

      /**
       * @param edi An EDI (electronic data interchange) configuration object. 
       */
      override fun edi(edi: EdiConfigurationProperty) {
        cdkBuilder.edi(edi.let(EdiConfigurationProperty::unwrap))
      }

      /**
       * @param edi An EDI (electronic data interchange) configuration object. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94d8f4fe2c5f0410e138a92ce9520289809defd53587b984a78e7511307ad324")
      override fun edi(edi: EdiConfigurationProperty.Builder.() -> Unit): Unit =
          edi(EdiConfigurationProperty(edi))

      public fun build():
          software.amazon.awscdk.services.b2bi.CfnCapability.CapabilityConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.b2bi.CfnCapability.CapabilityConfigurationProperty,
    ) : CdkObject(cdkObject), CapabilityConfigurationProperty {
      /**
       * An EDI (electronic data interchange) configuration object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-capabilityconfiguration.html#cfn-b2bi-capability-capabilityconfiguration-edi)
       */
      override fun edi(): Any = unwrap(this).getEdi()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CapabilityConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability.CapabilityConfigurationProperty):
          CapabilityConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CapabilityConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapabilityConfigurationProperty):
          software.amazon.awscdk.services.b2bi.CfnCapability.CapabilityConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnCapability.CapabilityConfigurationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * X12DetailsProperty x12DetailsProperty = X12DetailsProperty.builder()
   * .transactionSet("transactionSet")
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-x12details.html)
   */
  public interface X12DetailsProperty {
    /**
     * Returns an enumerated type where each value identifies an X12 transaction set.
     *
     * Transaction sets are maintained by the X12 Accredited Standards Committee.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-x12details.html#cfn-b2bi-capability-x12details-transactionset)
     */
    public fun transactionSet(): String? = unwrap(this).getTransactionSet()

    /**
     * Returns the version to use for the specified X12 transaction set.
     *
     * Supported versions are `4010` , `4030` , and `5010` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-x12details.html#cfn-b2bi-capability-x12details-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [X12DetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param transactionSet Returns an enumerated type where each value identifies an X12
       * transaction set.
       * Transaction sets are maintained by the X12 Accredited Standards Committee.
       */
      public fun transactionSet(transactionSet: String)

      /**
       * @param version Returns the version to use for the specified X12 transaction set.
       * Supported versions are `4010` , `4030` , and `5010` .
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnCapability.X12DetailsProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnCapability.X12DetailsProperty.builder()

      /**
       * @param transactionSet Returns an enumerated type where each value identifies an X12
       * transaction set.
       * Transaction sets are maintained by the X12 Accredited Standards Committee.
       */
      override fun transactionSet(transactionSet: String) {
        cdkBuilder.transactionSet(transactionSet)
      }

      /**
       * @param version Returns the version to use for the specified X12 transaction set.
       * Supported versions are `4010` , `4030` , and `5010` .
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.b2bi.CfnCapability.X12DetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability.X12DetailsProperty,
    ) : CdkObject(cdkObject), X12DetailsProperty {
      /**
       * Returns an enumerated type where each value identifies an X12 transaction set.
       *
       * Transaction sets are maintained by the X12 Accredited Standards Committee.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-x12details.html#cfn-b2bi-capability-x12details-transactionset)
       */
      override fun transactionSet(): String? = unwrap(this).getTransactionSet()

      /**
       * Returns the version to use for the specified X12 transaction set.
       *
       * Supported versions are `4010` , `4030` , and `5010` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-x12details.html#cfn-b2bi-capability-x12details-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): X12DetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability.X12DetailsProperty):
          X12DetailsProperty = CdkObjectWrappers.wrap(cdkObject) as? X12DetailsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: X12DetailsProperty):
          software.amazon.awscdk.services.b2bi.CfnCapability.X12DetailsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnCapability.X12DetailsProperty
    }
  }

  /**
   * Specifies the details for the EDI (electronic data interchange) transformation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * EdiConfigurationProperty ediConfigurationProperty = EdiConfigurationProperty.builder()
   * .inputLocation(S3LocationProperty.builder()
   * .bucketName("bucketName")
   * .key("key")
   * .build())
   * .outputLocation(S3LocationProperty.builder()
   * .bucketName("bucketName")
   * .key("key")
   * .build())
   * .transformerId("transformerId")
   * .type(EdiTypeProperty.builder()
   * .x12Details(X12DetailsProperty.builder()
   * .transactionSet("transactionSet")
   * .version("version")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-ediconfiguration.html)
   */
  public interface EdiConfigurationProperty {
    /**
     * Contains the Amazon S3 bucket and prefix for the location of the input file, which is
     * contained in an `S3Location` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-ediconfiguration.html#cfn-b2bi-capability-ediconfiguration-inputlocation)
     */
    public fun inputLocation(): Any

    /**
     * Contains the Amazon S3 bucket and prefix for the location of the output file, which is
     * contained in an `S3Location` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-ediconfiguration.html#cfn-b2bi-capability-ediconfiguration-outputlocation)
     */
    public fun outputLocation(): Any

    /**
     * Returns the system-assigned unique identifier for the transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-ediconfiguration.html#cfn-b2bi-capability-ediconfiguration-transformerid)
     */
    public fun transformerId(): String

    /**
     * Returns the type of the capability.
     *
     * Currently, only `edi` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-ediconfiguration.html#cfn-b2bi-capability-ediconfiguration-type)
     */
    public fun type(): Any

    /**
     * A builder for [EdiConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputLocation Contains the Amazon S3 bucket and prefix for the location of the input
       * file, which is contained in an `S3Location` object. 
       */
      public fun inputLocation(inputLocation: IResolvable)

      /**
       * @param inputLocation Contains the Amazon S3 bucket and prefix for the location of the input
       * file, which is contained in an `S3Location` object. 
       */
      public fun inputLocation(inputLocation: S3LocationProperty)

      /**
       * @param inputLocation Contains the Amazon S3 bucket and prefix for the location of the input
       * file, which is contained in an `S3Location` object. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9711a48fef29876bea8efa2203e11c23bfeee8eaf7ef107551b482f7c094b3a6")
      public fun inputLocation(inputLocation: S3LocationProperty.Builder.() -> Unit)

      /**
       * @param outputLocation Contains the Amazon S3 bucket and prefix for the location of the
       * output file, which is contained in an `S3Location` object. 
       */
      public fun outputLocation(outputLocation: IResolvable)

      /**
       * @param outputLocation Contains the Amazon S3 bucket and prefix for the location of the
       * output file, which is contained in an `S3Location` object. 
       */
      public fun outputLocation(outputLocation: S3LocationProperty)

      /**
       * @param outputLocation Contains the Amazon S3 bucket and prefix for the location of the
       * output file, which is contained in an `S3Location` object. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c322b01a9a16e6080ed97f50aa47e91385bea666c445f1d73e82bfbc616a364d")
      public fun outputLocation(outputLocation: S3LocationProperty.Builder.() -> Unit)

      /**
       * @param transformerId Returns the system-assigned unique identifier for the transformer. 
       */
      public fun transformerId(transformerId: String)

      /**
       * @param type Returns the type of the capability. 
       * Currently, only `edi` is supported.
       */
      public fun type(type: IResolvable)

      /**
       * @param type Returns the type of the capability. 
       * Currently, only `edi` is supported.
       */
      public fun type(type: EdiTypeProperty)

      /**
       * @param type Returns the type of the capability. 
       * Currently, only `edi` is supported.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16fb75b5b13232d13ec3662e92ea290c48516c04a866312d107eb1e18c51c0b4")
      public fun type(type: EdiTypeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnCapability.EdiConfigurationProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnCapability.EdiConfigurationProperty.builder()

      /**
       * @param inputLocation Contains the Amazon S3 bucket and prefix for the location of the input
       * file, which is contained in an `S3Location` object. 
       */
      override fun inputLocation(inputLocation: IResolvable) {
        cdkBuilder.inputLocation(inputLocation.let(IResolvable::unwrap))
      }

      /**
       * @param inputLocation Contains the Amazon S3 bucket and prefix for the location of the input
       * file, which is contained in an `S3Location` object. 
       */
      override fun inputLocation(inputLocation: S3LocationProperty) {
        cdkBuilder.inputLocation(inputLocation.let(S3LocationProperty::unwrap))
      }

      /**
       * @param inputLocation Contains the Amazon S3 bucket and prefix for the location of the input
       * file, which is contained in an `S3Location` object. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9711a48fef29876bea8efa2203e11c23bfeee8eaf7ef107551b482f7c094b3a6")
      override fun inputLocation(inputLocation: S3LocationProperty.Builder.() -> Unit): Unit =
          inputLocation(S3LocationProperty(inputLocation))

      /**
       * @param outputLocation Contains the Amazon S3 bucket and prefix for the location of the
       * output file, which is contained in an `S3Location` object. 
       */
      override fun outputLocation(outputLocation: IResolvable) {
        cdkBuilder.outputLocation(outputLocation.let(IResolvable::unwrap))
      }

      /**
       * @param outputLocation Contains the Amazon S3 bucket and prefix for the location of the
       * output file, which is contained in an `S3Location` object. 
       */
      override fun outputLocation(outputLocation: S3LocationProperty) {
        cdkBuilder.outputLocation(outputLocation.let(S3LocationProperty::unwrap))
      }

      /**
       * @param outputLocation Contains the Amazon S3 bucket and prefix for the location of the
       * output file, which is contained in an `S3Location` object. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c322b01a9a16e6080ed97f50aa47e91385bea666c445f1d73e82bfbc616a364d")
      override fun outputLocation(outputLocation: S3LocationProperty.Builder.() -> Unit): Unit =
          outputLocation(S3LocationProperty(outputLocation))

      /**
       * @param transformerId Returns the system-assigned unique identifier for the transformer. 
       */
      override fun transformerId(transformerId: String) {
        cdkBuilder.transformerId(transformerId)
      }

      /**
       * @param type Returns the type of the capability. 
       * Currently, only `edi` is supported.
       */
      override fun type(type: IResolvable) {
        cdkBuilder.type(type.let(IResolvable::unwrap))
      }

      /**
       * @param type Returns the type of the capability. 
       * Currently, only `edi` is supported.
       */
      override fun type(type: EdiTypeProperty) {
        cdkBuilder.type(type.let(EdiTypeProperty::unwrap))
      }

      /**
       * @param type Returns the type of the capability. 
       * Currently, only `edi` is supported.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16fb75b5b13232d13ec3662e92ea290c48516c04a866312d107eb1e18c51c0b4")
      override fun type(type: EdiTypeProperty.Builder.() -> Unit): Unit =
          type(EdiTypeProperty(type))

      public fun build():
          software.amazon.awscdk.services.b2bi.CfnCapability.EdiConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.b2bi.CfnCapability.EdiConfigurationProperty,
    ) : CdkObject(cdkObject), EdiConfigurationProperty {
      /**
       * Contains the Amazon S3 bucket and prefix for the location of the input file, which is
       * contained in an `S3Location` object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-ediconfiguration.html#cfn-b2bi-capability-ediconfiguration-inputlocation)
       */
      override fun inputLocation(): Any = unwrap(this).getInputLocation()

      /**
       * Contains the Amazon S3 bucket and prefix for the location of the output file, which is
       * contained in an `S3Location` object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-ediconfiguration.html#cfn-b2bi-capability-ediconfiguration-outputlocation)
       */
      override fun outputLocation(): Any = unwrap(this).getOutputLocation()

      /**
       * Returns the system-assigned unique identifier for the transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-ediconfiguration.html#cfn-b2bi-capability-ediconfiguration-transformerid)
       */
      override fun transformerId(): String = unwrap(this).getTransformerId()

      /**
       * Returns the type of the capability.
       *
       * Currently, only `edi` is supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-ediconfiguration.html#cfn-b2bi-capability-ediconfiguration-type)
       */
      override fun type(): Any = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EdiConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability.EdiConfigurationProperty):
          EdiConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? EdiConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EdiConfigurationProperty):
          software.amazon.awscdk.services.b2bi.CfnCapability.EdiConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnCapability.EdiConfigurationProperty
    }
  }

  /**
   * Specifies the details for the EDI standard that is being used for the transformer.
   *
   * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
   * define specific business documents.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * EdiTypeProperty ediTypeProperty = EdiTypeProperty.builder()
   * .x12Details(X12DetailsProperty.builder()
   * .transactionSet("transactionSet")
   * .version("version")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-editype.html)
   */
  public interface EdiTypeProperty {
    /**
     * Returns the details for the EDI standard that is being used for the transformer.
     *
     * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
     * define specific business documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-editype.html#cfn-b2bi-capability-editype-x12details)
     */
    public fun x12Details(): Any

    /**
     * A builder for [EdiTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param x12Details Returns the details for the EDI standard that is being used for the
       * transformer. 
       * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
       * define specific business documents.
       */
      public fun x12Details(x12Details: IResolvable)

      /**
       * @param x12Details Returns the details for the EDI standard that is being used for the
       * transformer. 
       * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
       * define specific business documents.
       */
      public fun x12Details(x12Details: X12DetailsProperty)

      /**
       * @param x12Details Returns the details for the EDI standard that is being used for the
       * transformer. 
       * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
       * define specific business documents.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a23b4587c8e9ebabd3a19d1f1afbff5ed1f74627cc0c6a1bd285efac39369168")
      public fun x12Details(x12Details: X12DetailsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnCapability.EdiTypeProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnCapability.EdiTypeProperty.builder()

      /**
       * @param x12Details Returns the details for the EDI standard that is being used for the
       * transformer. 
       * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
       * define specific business documents.
       */
      override fun x12Details(x12Details: IResolvable) {
        cdkBuilder.x12Details(x12Details.let(IResolvable::unwrap))
      }

      /**
       * @param x12Details Returns the details for the EDI standard that is being used for the
       * transformer. 
       * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
       * define specific business documents.
       */
      override fun x12Details(x12Details: X12DetailsProperty) {
        cdkBuilder.x12Details(x12Details.let(X12DetailsProperty::unwrap))
      }

      /**
       * @param x12Details Returns the details for the EDI standard that is being used for the
       * transformer. 
       * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
       * define specific business documents.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a23b4587c8e9ebabd3a19d1f1afbff5ed1f74627cc0c6a1bd285efac39369168")
      override fun x12Details(x12Details: X12DetailsProperty.Builder.() -> Unit): Unit =
          x12Details(X12DetailsProperty(x12Details))

      public fun build(): software.amazon.awscdk.services.b2bi.CfnCapability.EdiTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability.EdiTypeProperty,
    ) : CdkObject(cdkObject), EdiTypeProperty {
      /**
       * Returns the details for the EDI standard that is being used for the transformer.
       *
       * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
       * define specific business documents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-editype.html#cfn-b2bi-capability-editype-x12details)
       */
      override fun x12Details(): Any = unwrap(this).getX12Details()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EdiTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability.EdiTypeProperty):
          EdiTypeProperty = CdkObjectWrappers.wrap(cdkObject) as? EdiTypeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EdiTypeProperty):
          software.amazon.awscdk.services.b2bi.CfnCapability.EdiTypeProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.b2bi.CfnCapability.EdiTypeProperty
    }
  }

  /**
   * Specifies the details for the Amazon S3 file location that is being used with AWS B2BI Data
   * Interchange.
   *
   * File locations in Amazon S3 are identified using a combination of the bucket and key.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .bucketName("bucketName")
   * .key("key")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * Specifies the name of the Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-s3location.html#cfn-b2bi-capability-s3location-bucketname)
     */
    public fun bucketName(): String? = unwrap(this).getBucketName()

    /**
     * Specifies the Amazon S3 key for the file location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-s3location.html#cfn-b2bi-capability-s3location-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName Specifies the name of the Amazon S3 bucket.
       */
      public fun bucketName(bucketName: String)

      /**
       * @param key Specifies the Amazon S3 key for the file location.
       */
      public fun key(key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnCapability.S3LocationProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnCapability.S3LocationProperty.builder()

      /**
       * @param bucketName Specifies the name of the Amazon S3 bucket.
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param key Specifies the Amazon S3 key for the file location.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build(): software.amazon.awscdk.services.b2bi.CfnCapability.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability.S3LocationProperty,
    ) : CdkObject(cdkObject), S3LocationProperty {
      /**
       * Specifies the name of the Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-s3location.html#cfn-b2bi-capability-s3location-bucketname)
       */
      override fun bucketName(): String? = unwrap(this).getBucketName()

      /**
       * Specifies the Amazon S3 key for the file location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-s3location.html#cfn-b2bi-capability-s3location-key)
       */
      override fun key(): String? = unwrap(this).getKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnCapability.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.b2bi.CfnCapability.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnCapability.S3LocationProperty
    }
  }
}
