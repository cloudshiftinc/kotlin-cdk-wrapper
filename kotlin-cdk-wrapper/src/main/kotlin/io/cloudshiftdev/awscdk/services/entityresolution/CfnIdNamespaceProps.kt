@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.entityresolution

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnIdNamespace`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.entityresolution.*;
 * CfnIdNamespaceProps cfnIdNamespaceProps = CfnIdNamespaceProps.builder()
 * .idNamespaceName("idNamespaceName")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .idMappingWorkflowProperties(List.of(IdNamespaceIdMappingWorkflowPropertiesProperty.builder()
 * .idMappingType("idMappingType")
 * // the properties below are optional
 * .providerProperties(NamespaceProviderPropertiesProperty.builder()
 * .providerServiceArn("providerServiceArn")
 * // the properties below are optional
 * .providerConfiguration(Map.of(
 * "providerConfigurationKey", "providerConfiguration"))
 * .build())
 * .build()))
 * .inputSourceConfig(List.of(IdNamespaceInputSourceProperty.builder()
 * .inputSourceArn("inputSourceArn")
 * // the properties below are optional
 * .schemaName("schemaName")
 * .build()))
 * .roleArn("roleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html)
 */
public interface CfnIdNamespaceProps {
  /**
   * The description of the ID namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Determines the properties of `IdMappingWorflow` where this `IdNamespace` can be used as a
   * `Source` or a `Target` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-idmappingworkflowproperties)
   */
  public fun idMappingWorkflowProperties(): Any? = unwrap(this).getIdMappingWorkflowProperties()

  /**
   * The name of the ID namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-idnamespacename)
   */
  public fun idNamespaceName(): String

  /**
   * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-inputsourceconfig)
   */
  public fun inputSourceConfig(): Any? = unwrap(this).getInputSourceConfig()

  /**
   * The Amazon Resource Name (ARN) of the IAM role.
   *
   * AWS Entity Resolution assumes this role to access the resources defined in this `IdNamespace`
   * on your behalf as part of the workflow run.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of ID namespace. There are two types: `SOURCE` and `TARGET` .
   *
   * The `SOURCE` contains configurations for `sourceId` data that will be processed in an ID
   * mapping workflow.
   *
   * The `TARGET` contains a configuration of `targetId` to which all `sourceIds` will resolve to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnIdNamespaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the ID namespace.
     */
    public fun description(description: String)

    /**
     * @param idMappingWorkflowProperties Determines the properties of `IdMappingWorflow` where this
     * `IdNamespace` can be used as a `Source` or a `Target` .
     */
    public fun idMappingWorkflowProperties(idMappingWorkflowProperties: IResolvable)

    /**
     * @param idMappingWorkflowProperties Determines the properties of `IdMappingWorflow` where this
     * `IdNamespace` can be used as a `Source` or a `Target` .
     */
    public fun idMappingWorkflowProperties(idMappingWorkflowProperties: List<Any>)

    /**
     * @param idMappingWorkflowProperties Determines the properties of `IdMappingWorflow` where this
     * `IdNamespace` can be used as a `Source` or a `Target` .
     */
    public fun idMappingWorkflowProperties(vararg idMappingWorkflowProperties: Any)

    /**
     * @param idNamespaceName The name of the ID namespace. 
     */
    public fun idNamespaceName(idNamespaceName: String)

    /**
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` .
     */
    public fun inputSourceConfig(inputSourceConfig: IResolvable)

    /**
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` .
     */
    public fun inputSourceConfig(inputSourceConfig: List<Any>)

    /**
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` .
     */
    public fun inputSourceConfig(vararg inputSourceConfig: Any)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role.
     * AWS Entity Resolution assumes this role to access the resources defined in this `IdNamespace`
     * on your behalf as part of the workflow run.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of ID namespace. There are two types: `SOURCE` and `TARGET` . 
     * The `SOURCE` contains configurations for `sourceId` data that will be processed in an ID
     * mapping workflow.
     *
     * The `TARGET` contains a configuration of `targetId` to which all `sourceIds` will resolve to.
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.entityresolution.CfnIdNamespaceProps.Builder =
        software.amazon.awscdk.services.entityresolution.CfnIdNamespaceProps.builder()

    /**
     * @param description The description of the ID namespace.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param idMappingWorkflowProperties Determines the properties of `IdMappingWorflow` where this
     * `IdNamespace` can be used as a `Source` or a `Target` .
     */
    override fun idMappingWorkflowProperties(idMappingWorkflowProperties: IResolvable) {
      cdkBuilder.idMappingWorkflowProperties(idMappingWorkflowProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param idMappingWorkflowProperties Determines the properties of `IdMappingWorflow` where this
     * `IdNamespace` can be used as a `Source` or a `Target` .
     */
    override fun idMappingWorkflowProperties(idMappingWorkflowProperties: List<Any>) {
      cdkBuilder.idMappingWorkflowProperties(idMappingWorkflowProperties.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param idMappingWorkflowProperties Determines the properties of `IdMappingWorflow` where this
     * `IdNamespace` can be used as a `Source` or a `Target` .
     */
    override fun idMappingWorkflowProperties(vararg idMappingWorkflowProperties: Any): Unit =
        idMappingWorkflowProperties(idMappingWorkflowProperties.toList())

    /**
     * @param idNamespaceName The name of the ID namespace. 
     */
    override fun idNamespaceName(idNamespaceName: String) {
      cdkBuilder.idNamespaceName(idNamespaceName)
    }

    /**
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` .
     */
    override fun inputSourceConfig(inputSourceConfig: IResolvable) {
      cdkBuilder.inputSourceConfig(inputSourceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` .
     */
    override fun inputSourceConfig(inputSourceConfig: List<Any>) {
      cdkBuilder.inputSourceConfig(inputSourceConfig.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` .
     */
    override fun inputSourceConfig(vararg inputSourceConfig: Any): Unit =
        inputSourceConfig(inputSourceConfig.toList())

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role.
     * AWS Entity Resolution assumes this role to access the resources defined in this `IdNamespace`
     * on your behalf as part of the workflow run.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of ID namespace. There are two types: `SOURCE` and `TARGET` . 
     * The `SOURCE` contains configurations for `sourceId` data that will be processed in an ID
     * mapping workflow.
     *
     * The `TARGET` contains a configuration of `targetId` to which all `sourceIds` will resolve to.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.entityresolution.CfnIdNamespaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdNamespaceProps,
  ) : CdkObject(cdkObject), CfnIdNamespaceProps {
    /**
     * The description of the ID namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Determines the properties of `IdMappingWorflow` where this `IdNamespace` can be used as a
     * `Source` or a `Target` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-idmappingworkflowproperties)
     */
    override fun idMappingWorkflowProperties(): Any? = unwrap(this).getIdMappingWorkflowProperties()

    /**
     * The name of the ID namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-idnamespacename)
     */
    override fun idNamespaceName(): String = unwrap(this).getIdNamespaceName()

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-inputsourceconfig)
     */
    override fun inputSourceConfig(): Any? = unwrap(this).getInputSourceConfig()

    /**
     * The Amazon Resource Name (ARN) of the IAM role.
     *
     * AWS Entity Resolution assumes this role to access the resources defined in this `IdNamespace`
     * on your behalf as part of the workflow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of ID namespace. There are two types: `SOURCE` and `TARGET` .
     *
     * The `SOURCE` contains configurations for `sourceId` data that will be processed in an ID
     * mapping workflow.
     *
     * The `TARGET` contains a configuration of `targetId` to which all `sourceIds` will resolve to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idnamespace.html#cfn-entityresolution-idnamespace-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdNamespaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdNamespaceProps):
        CfnIdNamespaceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnIdNamespaceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIdNamespaceProps):
        software.amazon.awscdk.services.entityresolution.CfnIdNamespaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.entityresolution.CfnIdNamespaceProps
  }
}
