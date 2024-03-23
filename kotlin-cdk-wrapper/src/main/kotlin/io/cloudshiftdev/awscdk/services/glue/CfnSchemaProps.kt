@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

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
 * Properties for defining a `CfnSchema`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * CfnSchemaProps cfnSchemaProps = CfnSchemaProps.builder()
 * .compatibility("compatibility")
 * .dataFormat("dataFormat")
 * .name("name")
 * .schemaDefinition("schemaDefinition")
 * // the properties below are optional
 * .checkpointVersion(SchemaVersionProperty.builder()
 * .isLatest(false)
 * .versionNumber(123)
 * .build())
 * .description("description")
 * .registry(RegistryProperty.builder()
 * .arn("arn")
 * .name("name")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html)
 */
public interface CfnSchemaProps {
  /**
   * Specify the `VersionNumber` or the `IsLatest` for setting the checkpoint for the schema.
   *
   * This is only required for updating a checkpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-checkpointversion)
   */
  public fun checkpointVersion(): Any? = unwrap(this).getCheckpointVersion()

  /**
   * The compatibility mode of the schema.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-compatibility)
   */
  public fun compatibility(): String

  /**
   * The data format of the schema definition.
   *
   * Currently only `AVRO` is supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-dataformat)
   */
  public fun dataFormat(): String

  /**
   * A description of the schema if specified when created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Name of the schema to be created of max length of 255, and may only contain letters, numbers,
   * hyphen, underscore, dollar sign, or hash mark.
   *
   * No whitespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-name)
   */
  public fun name(): String

  /**
   * The registry where a schema is stored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-registry)
   */
  public fun registry(): Any? = unwrap(this).getRegistry()

  /**
   * The schema definition using the `DataFormat` setting for `SchemaName` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-schemadefinition)
   */
  public fun schemaDefinition(): String

  /**
   * AWS tags that contain a key value pair and may be searched by console, command line, or API.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSchemaProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param checkpointVersion Specify the `VersionNumber` or the `IsLatest` for setting the
     * checkpoint for the schema.
     * This is only required for updating a checkpoint.
     */
    public fun checkpointVersion(checkpointVersion: IResolvable)

    /**
     * @param checkpointVersion Specify the `VersionNumber` or the `IsLatest` for setting the
     * checkpoint for the schema.
     * This is only required for updating a checkpoint.
     */
    public fun checkpointVersion(checkpointVersion: CfnSchema.SchemaVersionProperty)

    /**
     * @param checkpointVersion Specify the `VersionNumber` or the `IsLatest` for setting the
     * checkpoint for the schema.
     * This is only required for updating a checkpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c75c07562ce15d37ae224d124cc10908c5ef5ab588e50650b14d02e8490a8b58")
    public
        fun checkpointVersion(checkpointVersion: CfnSchema.SchemaVersionProperty.Builder.() -> Unit)

    /**
     * @param compatibility The compatibility mode of the schema. 
     */
    public fun compatibility(compatibility: String)

    /**
     * @param dataFormat The data format of the schema definition. 
     * Currently only `AVRO` is supported.
     */
    public fun dataFormat(dataFormat: String)

    /**
     * @param description A description of the schema if specified when created.
     */
    public fun description(description: String)

    /**
     * @param name Name of the schema to be created of max length of 255, and may only contain
     * letters, numbers, hyphen, underscore, dollar sign, or hash mark. 
     * No whitespace.
     */
    public fun name(name: String)

    /**
     * @param registry The registry where a schema is stored.
     */
    public fun registry(registry: IResolvable)

    /**
     * @param registry The registry where a schema is stored.
     */
    public fun registry(registry: CfnSchema.RegistryProperty)

    /**
     * @param registry The registry where a schema is stored.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a3b2596fa4c40d4f30a161754f91ae2d6312f4b95f42094a100c0e572dce546")
    public fun registry(registry: CfnSchema.RegistryProperty.Builder.() -> Unit)

    /**
     * @param schemaDefinition The schema definition using the `DataFormat` setting for `SchemaName`
     * . 
     */
    public fun schemaDefinition(schemaDefinition: String)

    /**
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     * line, or API.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     * line, or API.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnSchemaProps.Builder =
        software.amazon.awscdk.services.glue.CfnSchemaProps.builder()

    /**
     * @param checkpointVersion Specify the `VersionNumber` or the `IsLatest` for setting the
     * checkpoint for the schema.
     * This is only required for updating a checkpoint.
     */
    override fun checkpointVersion(checkpointVersion: IResolvable) {
      cdkBuilder.checkpointVersion(checkpointVersion.let(IResolvable::unwrap))
    }

    /**
     * @param checkpointVersion Specify the `VersionNumber` or the `IsLatest` for setting the
     * checkpoint for the schema.
     * This is only required for updating a checkpoint.
     */
    override fun checkpointVersion(checkpointVersion: CfnSchema.SchemaVersionProperty) {
      cdkBuilder.checkpointVersion(checkpointVersion.let(CfnSchema.SchemaVersionProperty::unwrap))
    }

    /**
     * @param checkpointVersion Specify the `VersionNumber` or the `IsLatest` for setting the
     * checkpoint for the schema.
     * This is only required for updating a checkpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c75c07562ce15d37ae224d124cc10908c5ef5ab588e50650b14d02e8490a8b58")
    override
        fun checkpointVersion(checkpointVersion: CfnSchema.SchemaVersionProperty.Builder.() -> Unit):
        Unit = checkpointVersion(CfnSchema.SchemaVersionProperty(checkpointVersion))

    /**
     * @param compatibility The compatibility mode of the schema. 
     */
    override fun compatibility(compatibility: String) {
      cdkBuilder.compatibility(compatibility)
    }

    /**
     * @param dataFormat The data format of the schema definition. 
     * Currently only `AVRO` is supported.
     */
    override fun dataFormat(dataFormat: String) {
      cdkBuilder.dataFormat(dataFormat)
    }

    /**
     * @param description A description of the schema if specified when created.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name Name of the schema to be created of max length of 255, and may only contain
     * letters, numbers, hyphen, underscore, dollar sign, or hash mark. 
     * No whitespace.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param registry The registry where a schema is stored.
     */
    override fun registry(registry: IResolvable) {
      cdkBuilder.registry(registry.let(IResolvable::unwrap))
    }

    /**
     * @param registry The registry where a schema is stored.
     */
    override fun registry(registry: CfnSchema.RegistryProperty) {
      cdkBuilder.registry(registry.let(CfnSchema.RegistryProperty::unwrap))
    }

    /**
     * @param registry The registry where a schema is stored.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a3b2596fa4c40d4f30a161754f91ae2d6312f4b95f42094a100c0e572dce546")
    override fun registry(registry: CfnSchema.RegistryProperty.Builder.() -> Unit): Unit =
        registry(CfnSchema.RegistryProperty(registry))

    /**
     * @param schemaDefinition The schema definition using the `DataFormat` setting for `SchemaName`
     * . 
     */
    override fun schemaDefinition(schemaDefinition: String) {
      cdkBuilder.schemaDefinition(schemaDefinition)
    }

    /**
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     * line, or API.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     * line, or API.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.glue.CfnSchemaProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.glue.CfnSchemaProps,
  ) : CdkObject(cdkObject), CfnSchemaProps {
    /**
     * Specify the `VersionNumber` or the `IsLatest` for setting the checkpoint for the schema.
     *
     * This is only required for updating a checkpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-checkpointversion)
     */
    override fun checkpointVersion(): Any? = unwrap(this).getCheckpointVersion()

    /**
     * The compatibility mode of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-compatibility)
     */
    override fun compatibility(): String = unwrap(this).getCompatibility()

    /**
     * The data format of the schema definition.
     *
     * Currently only `AVRO` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-dataformat)
     */
    override fun dataFormat(): String = unwrap(this).getDataFormat()

    /**
     * A description of the schema if specified when created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Name of the schema to be created of max length of 255, and may only contain letters, numbers,
     * hyphen, underscore, dollar sign, or hash mark.
     *
     * No whitespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The registry where a schema is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-registry)
     */
    override fun registry(): Any? = unwrap(this).getRegistry()

    /**
     * The schema definition using the `DataFormat` setting for `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-schemadefinition)
     */
    override fun schemaDefinition(): String = unwrap(this).getSchemaDefinition()

    /**
     * AWS tags that contain a key value pair and may be searched by console, command line, or API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSchemaProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSchemaProps):
        CfnSchemaProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSchemaProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSchemaProps):
        software.amazon.awscdk.services.glue.CfnSchemaProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.glue.CfnSchemaProps
  }
}
