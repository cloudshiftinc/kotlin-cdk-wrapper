package io.cloudshiftdev.awscdk.services.customerprofiles

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnIntegrationProps {
  /**
   * The unique name of the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-domainname)
   */
  public fun domainName(): String

  /**
   * The configuration that controls how Customer Profiles retrieves data from the source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-flowdefinition)
   */
  public fun flowDefinition(): Any? = unwrap(this).getFlowDefinition()

  /**
   * The name of the profile object type mapping to use.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-objecttypename)
   */
  public fun objectTypeName(): String? = unwrap(this).getObjectTypeName()

  /**
   * The object type mapping.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-objecttypenames)
   */
  public fun objectTypeNames(): Any? = unwrap(this).getObjectTypeNames()

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The URI of the S3 bucket or any other type of data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-uri)
   */
  public fun uri(): String? = unwrap(this).getUri()

  /**
   * A builder for [CfnIntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainName The unique name of the domain. 
     */
    public fun domainName(domainName: String)

    /**
     * @param flowDefinition The configuration that controls how Customer Profiles retrieves data
     * from the source.
     */
    public fun flowDefinition(flowDefinition: IResolvable)

    /**
     * @param flowDefinition The configuration that controls how Customer Profiles retrieves data
     * from the source.
     */
    public fun flowDefinition(flowDefinition: CfnIntegration.FlowDefinitionProperty)

    /**
     * @param flowDefinition The configuration that controls how Customer Profiles retrieves data
     * from the source.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("361b13d8b8317e8d987995200f2e4c8bfaa0838337f56983e387615fef506b97")
    public
        fun flowDefinition(flowDefinition: CfnIntegration.FlowDefinitionProperty.Builder.() -> Unit)

    /**
     * @param objectTypeName The name of the profile object type mapping to use.
     */
    public fun objectTypeName(objectTypeName: String)

    /**
     * @param objectTypeNames The object type mapping.
     */
    public fun objectTypeNames(objectTypeNames: IResolvable)

    /**
     * @param objectTypeNames The object type mapping.
     */
    public fun objectTypeNames(objectTypeNames: List<Any>)

    /**
     * @param objectTypeNames The object type mapping.
     */
    public fun objectTypeNames(vararg objectTypeNames: Any)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param uri The URI of the S3 bucket or any other type of data source.
     */
    public fun uri(uri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps.Builder =
        software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps.builder()

    /**
     * @param domainName The unique name of the domain. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param flowDefinition The configuration that controls how Customer Profiles retrieves data
     * from the source.
     */
    override fun flowDefinition(flowDefinition: IResolvable) {
      cdkBuilder.flowDefinition(flowDefinition.let(IResolvable::unwrap))
    }

    /**
     * @param flowDefinition The configuration that controls how Customer Profiles retrieves data
     * from the source.
     */
    override fun flowDefinition(flowDefinition: CfnIntegration.FlowDefinitionProperty) {
      cdkBuilder.flowDefinition(flowDefinition.let(CfnIntegration.FlowDefinitionProperty::unwrap))
    }

    /**
     * @param flowDefinition The configuration that controls how Customer Profiles retrieves data
     * from the source.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("361b13d8b8317e8d987995200f2e4c8bfaa0838337f56983e387615fef506b97")
    override
        fun flowDefinition(flowDefinition: CfnIntegration.FlowDefinitionProperty.Builder.() -> Unit):
        Unit = flowDefinition(CfnIntegration.FlowDefinitionProperty(flowDefinition))

    /**
     * @param objectTypeName The name of the profile object type mapping to use.
     */
    override fun objectTypeName(objectTypeName: String) {
      cdkBuilder.objectTypeName(objectTypeName)
    }

    /**
     * @param objectTypeNames The object type mapping.
     */
    override fun objectTypeNames(objectTypeNames: IResolvable) {
      cdkBuilder.objectTypeNames(objectTypeNames.let(IResolvable::unwrap))
    }

    /**
     * @param objectTypeNames The object type mapping.
     */
    override fun objectTypeNames(objectTypeNames: List<Any>) {
      cdkBuilder.objectTypeNames(objectTypeNames)
    }

    /**
     * @param objectTypeNames The object type mapping.
     */
    override fun objectTypeNames(vararg objectTypeNames: Any): Unit =
        objectTypeNames(objectTypeNames.toList())

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param uri The URI of the S3 bucket or any other type of data source.
     */
    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps,
  ) : CdkObject(cdkObject), CfnIntegrationProps {
    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The configuration that controls how Customer Profiles retrieves data from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-flowdefinition)
     */
    override fun flowDefinition(): Any? = unwrap(this).getFlowDefinition()

    /**
     * The name of the profile object type mapping to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-objecttypename)
     */
    override fun objectTypeName(): String? = unwrap(this).getObjectTypeName()

    /**
     * The object type mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-objecttypenames)
     */
    override fun objectTypeNames(): Any? = unwrap(this).getObjectTypeNames()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The URI of the S3 bucket or any other type of data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-uri)
     */
    override fun uri(): String? = unwrap(this).getUri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps):
        CfnIntegrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIntegrationProps):
        software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps
  }
}
