@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.b2bi

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
 * Properties for defining a `CfnCapability`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.b2bi.*;
 * CfnCapabilityProps cfnCapabilityProps = CfnCapabilityProps.builder()
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
public interface CfnCapabilityProps {
  /**
   * Specifies a structure that contains the details for a capability.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-configuration)
   */
  public fun configuration(): Any

  /**
   * Specifies one or more locations in Amazon S3, each specifying an EDI document that can be used
   * with this capability.
   *
   * Each item contains the name of the bucket and the key, to identify the document's location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-instructionsdocuments)
   */
  public fun instructionsDocuments(): Any? = unwrap(this).getInstructionsDocuments()

  /**
   * The display name of the capability.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-name)
   */
  public fun name(): String

  /**
   * Specifies the key-value pairs assigned to ARNs that you can use to group and search for
   * resources by type.
   *
   * You can attach this metadata to resources (capabilities, partnerships, and so on) for any
   * purpose.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Returns the type of the capability.
   *
   * Currently, only `edi` is supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnCapabilityProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configuration Specifies a structure that contains the details for a capability. 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * @param configuration Specifies a structure that contains the details for a capability. 
     */
    public fun configuration(configuration: CfnCapability.CapabilityConfigurationProperty)

    /**
     * @param configuration Specifies a structure that contains the details for a capability. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b77b4790aea029c3988f383f33d366a1b782e568cac552b36d6f1777c4d7e6af")
    public
        fun configuration(configuration: CfnCapability.CapabilityConfigurationProperty.Builder.() -> Unit)

    /**
     * @param instructionsDocuments Specifies one or more locations in Amazon S3, each specifying an
     * EDI document that can be used with this capability.
     * Each item contains the name of the bucket and the key, to identify the document's location.
     */
    public fun instructionsDocuments(instructionsDocuments: IResolvable)

    /**
     * @param instructionsDocuments Specifies one or more locations in Amazon S3, each specifying an
     * EDI document that can be used with this capability.
     * Each item contains the name of the bucket and the key, to identify the document's location.
     */
    public fun instructionsDocuments(instructionsDocuments: List<Any>)

    /**
     * @param instructionsDocuments Specifies one or more locations in Amazon S3, each specifying an
     * EDI document that can be used with this capability.
     * Each item contains the name of the bucket and the key, to identify the document's location.
     */
    public fun instructionsDocuments(vararg instructionsDocuments: Any)

    /**
     * @param name The display name of the capability. 
     */
    public fun name(name: String)

    /**
     * @param tags Specifies the key-value pairs assigned to ARNs that you can use to group and
     * search for resources by type.
     * You can attach this metadata to resources (capabilities, partnerships, and so on) for any
     * purpose.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies the key-value pairs assigned to ARNs that you can use to group and
     * search for resources by type.
     * You can attach this metadata to resources (capabilities, partnerships, and so on) for any
     * purpose.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type Returns the type of the capability. 
     * Currently, only `edi` is supported.
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.b2bi.CfnCapabilityProps.Builder =
        software.amazon.awscdk.services.b2bi.CfnCapabilityProps.builder()

    /**
     * @param configuration Specifies a structure that contains the details for a capability. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    /**
     * @param configuration Specifies a structure that contains the details for a capability. 
     */
    override fun configuration(configuration: CfnCapability.CapabilityConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CfnCapability.CapabilityConfigurationProperty::unwrap))
    }

    /**
     * @param configuration Specifies a structure that contains the details for a capability. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b77b4790aea029c3988f383f33d366a1b782e568cac552b36d6f1777c4d7e6af")
    override
        fun configuration(configuration: CfnCapability.CapabilityConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CfnCapability.CapabilityConfigurationProperty(configuration))

    /**
     * @param instructionsDocuments Specifies one or more locations in Amazon S3, each specifying an
     * EDI document that can be used with this capability.
     * Each item contains the name of the bucket and the key, to identify the document's location.
     */
    override fun instructionsDocuments(instructionsDocuments: IResolvable) {
      cdkBuilder.instructionsDocuments(instructionsDocuments.let(IResolvable::unwrap))
    }

    /**
     * @param instructionsDocuments Specifies one or more locations in Amazon S3, each specifying an
     * EDI document that can be used with this capability.
     * Each item contains the name of the bucket and the key, to identify the document's location.
     */
    override fun instructionsDocuments(instructionsDocuments: List<Any>) {
      cdkBuilder.instructionsDocuments(instructionsDocuments)
    }

    /**
     * @param instructionsDocuments Specifies one or more locations in Amazon S3, each specifying an
     * EDI document that can be used with this capability.
     * Each item contains the name of the bucket and the key, to identify the document's location.
     */
    override fun instructionsDocuments(vararg instructionsDocuments: Any): Unit =
        instructionsDocuments(instructionsDocuments.toList())

    /**
     * @param name The display name of the capability. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Specifies the key-value pairs assigned to ARNs that you can use to group and
     * search for resources by type.
     * You can attach this metadata to resources (capabilities, partnerships, and so on) for any
     * purpose.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Specifies the key-value pairs assigned to ARNs that you can use to group and
     * search for resources by type.
     * You can attach this metadata to resources (capabilities, partnerships, and so on) for any
     * purpose.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type Returns the type of the capability. 
     * Currently, only `edi` is supported.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.b2bi.CfnCapabilityProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.b2bi.CfnCapabilityProps,
  ) : CdkObject(cdkObject), CfnCapabilityProps {
    /**
     * Specifies a structure that contains the details for a capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-configuration)
     */
    override fun configuration(): Any = unwrap(this).getConfiguration()

    /**
     * Specifies one or more locations in Amazon S3, each specifying an EDI document that can be
     * used with this capability.
     *
     * Each item contains the name of the bucket and the key, to identify the document's location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-instructionsdocuments)
     */
    override fun instructionsDocuments(): Any? = unwrap(this).getInstructionsDocuments()

    /**
     * The display name of the capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for
     * resources by type.
     *
     * You can attach this metadata to resources (capabilities, partnerships, and so on) for any
     * purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Returns the type of the capability.
     *
     * Currently, only `edi` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html#cfn-b2bi-capability-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCapabilityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnCapabilityProps):
        CfnCapabilityProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCapabilityProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCapabilityProps):
        software.amazon.awscdk.services.b2bi.CfnCapabilityProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.b2bi.CfnCapabilityProps
  }
}
