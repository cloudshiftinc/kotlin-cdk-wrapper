@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFlowAlias`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnFlowAliasProps cfnFlowAliasProps = CfnFlowAliasProps.builder()
 * .flowArn("flowArn")
 * .name("name")
 * .routingConfiguration(List.of(FlowAliasRoutingConfigurationListItemProperty.builder()
 * .flowVersion("flowVersion")
 * .build()))
 * // the properties below are optional
 * .concurrencyConfiguration(FlowAliasConcurrencyConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .maxConcurrency(123)
 * .build())
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html)
 */
public interface CfnFlowAliasProps {
  /**
   * The configuration that specifies how nodes in the flow are executed concurrently.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-concurrencyconfiguration)
   */
  public fun concurrencyConfiguration(): Any? = unwrap(this).getConcurrencyConfiguration()

  /**
   * A description of the alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of the alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-flowarn)
   */
  public fun flowArn(): String

  /**
   * The name of the alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-name)
   */
  public fun name(): String

  /**
   * A list of configurations about the versions that the alias maps to.
   *
   * Currently, you can only specify one.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-routingconfiguration)
   */
  public fun routingConfiguration(): Any

  /**
   * Metadata that you can assign to a resource as key-value pairs. For more information, see the
   * following resources:.
   *
   * * [Tag naming limits and
   * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
   * * [Tagging best
   * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnFlowAliasProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param concurrencyConfiguration The configuration that specifies how nodes in the flow are
     * executed concurrently.
     */
    public fun concurrencyConfiguration(concurrencyConfiguration: IResolvable)

    /**
     * @param concurrencyConfiguration The configuration that specifies how nodes in the flow are
     * executed concurrently.
     */
    public
        fun concurrencyConfiguration(concurrencyConfiguration: CfnFlowAlias.FlowAliasConcurrencyConfigurationProperty)

    /**
     * @param concurrencyConfiguration The configuration that specifies how nodes in the flow are
     * executed concurrently.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c7d1d6c9b50891ca3e64f753b2303f73d890cfa26ff20a7d484cdf0dc1ffba9")
    public
        fun concurrencyConfiguration(concurrencyConfiguration: CfnFlowAlias.FlowAliasConcurrencyConfigurationProperty.Builder.() -> Unit)

    /**
     * @param description A description of the alias.
     */
    public fun description(description: String)

    /**
     * @param flowArn The Amazon Resource Name (ARN) of the alias. 
     */
    public fun flowArn(flowArn: String)

    /**
     * @param name The name of the alias. 
     */
    public fun name(name: String)

    /**
     * @param routingConfiguration A list of configurations about the versions that the alias maps
     * to. 
     * Currently, you can only specify one.
     */
    public fun routingConfiguration(routingConfiguration: IResolvable)

    /**
     * @param routingConfiguration A list of configurations about the versions that the alias maps
     * to. 
     * Currently, you can only specify one.
     */
    public fun routingConfiguration(routingConfiguration: List<Any>)

    /**
     * @param routingConfiguration A list of configurations about the versions that the alias maps
     * to. 
     * Currently, you can only specify one.
     */
    public fun routingConfiguration(vararg routingConfiguration: Any)

    /**
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:.
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnFlowAliasProps.Builder =
        software.amazon.awscdk.services.bedrock.CfnFlowAliasProps.builder()

    /**
     * @param concurrencyConfiguration The configuration that specifies how nodes in the flow are
     * executed concurrently.
     */
    override fun concurrencyConfiguration(concurrencyConfiguration: IResolvable) {
      cdkBuilder.concurrencyConfiguration(concurrencyConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param concurrencyConfiguration The configuration that specifies how nodes in the flow are
     * executed concurrently.
     */
    override
        fun concurrencyConfiguration(concurrencyConfiguration: CfnFlowAlias.FlowAliasConcurrencyConfigurationProperty) {
      cdkBuilder.concurrencyConfiguration(concurrencyConfiguration.let(CfnFlowAlias.FlowAliasConcurrencyConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param concurrencyConfiguration The configuration that specifies how nodes in the flow are
     * executed concurrently.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c7d1d6c9b50891ca3e64f753b2303f73d890cfa26ff20a7d484cdf0dc1ffba9")
    override
        fun concurrencyConfiguration(concurrencyConfiguration: CfnFlowAlias.FlowAliasConcurrencyConfigurationProperty.Builder.() -> Unit):
        Unit =
        concurrencyConfiguration(CfnFlowAlias.FlowAliasConcurrencyConfigurationProperty(concurrencyConfiguration))

    /**
     * @param description A description of the alias.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param flowArn The Amazon Resource Name (ARN) of the alias. 
     */
    override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
    }

    /**
     * @param name The name of the alias. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param routingConfiguration A list of configurations about the versions that the alias maps
     * to. 
     * Currently, you can only specify one.
     */
    override fun routingConfiguration(routingConfiguration: IResolvable) {
      cdkBuilder.routingConfiguration(routingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param routingConfiguration A list of configurations about the versions that the alias maps
     * to. 
     * Currently, you can only specify one.
     */
    override fun routingConfiguration(routingConfiguration: List<Any>) {
      cdkBuilder.routingConfiguration(routingConfiguration.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param routingConfiguration A list of configurations about the versions that the alias maps
     * to. 
     * Currently, you can only specify one.
     */
    override fun routingConfiguration(vararg routingConfiguration: Any): Unit =
        routingConfiguration(routingConfiguration.toList())

    /**
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:.
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.bedrock.CfnFlowAliasProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowAliasProps,
  ) : CdkObject(cdkObject),
      CfnFlowAliasProps {
    /**
     * The configuration that specifies how nodes in the flow are executed concurrently.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-concurrencyconfiguration)
     */
    override fun concurrencyConfiguration(): Any? = unwrap(this).getConcurrencyConfiguration()

    /**
     * A description of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Amazon Resource Name (ARN) of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-flowarn)
     */
    override fun flowArn(): String = unwrap(this).getFlowArn()

    /**
     * The name of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A list of configurations about the versions that the alias maps to.
     *
     * Currently, you can only specify one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-routingconfiguration)
     */
    override fun routingConfiguration(): Any = unwrap(this).getRoutingConfiguration()

    /**
     * Metadata that you can assign to a resource as key-value pairs. For more information, see the
     * following resources:.
     *
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flowalias.html#cfn-bedrock-flowalias-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowAliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowAliasProps):
        CfnFlowAliasProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFlowAliasProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlowAliasProps):
        software.amazon.awscdk.services.bedrock.CfnFlowAliasProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.bedrock.CfnFlowAliasProps
  }
}
