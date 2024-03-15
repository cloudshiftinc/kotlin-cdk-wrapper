@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnMigrationProjectProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun instanceProfileArn(): String? = unwrap(this).getInstanceProfileArn()

  public fun instanceProfileIdentifier(): String? = unwrap(this).getInstanceProfileIdentifier()

  public fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

  @Deprecated(message = "deprecated in CDK")
  public fun migrationProjectCreationTime(): String? =
      unwrap(this).getMigrationProjectCreationTime()

  public fun migrationProjectIdentifier(): String? = unwrap(this).getMigrationProjectIdentifier()

  public fun migrationProjectName(): String? = unwrap(this).getMigrationProjectName()

  public fun schemaConversionApplicationAttributes(): Any? =
      unwrap(this).getSchemaConversionApplicationAttributes()

  public fun sourceDataProviderDescriptors(): Any? = unwrap(this).getSourceDataProviderDescriptors()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun targetDataProviderDescriptors(): Any? = unwrap(this).getTargetDataProviderDescriptors()

  public fun transformationRules(): String? = unwrap(this).getTransformationRules()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun instanceProfileArn(instanceProfileArn: String)

    public fun instanceProfileIdentifier(instanceProfileIdentifier: String)

    public fun instanceProfileName(instanceProfileName: String)

    @Deprecated(message = "deprecated in CDK")
    public fun migrationProjectCreationTime(migrationProjectCreationTime: String)

    public fun migrationProjectIdentifier(migrationProjectIdentifier: String)

    public fun migrationProjectName(migrationProjectName: String)

    public
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: IResolvable)

    public
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: CfnMigrationProject.SchemaConversionApplicationAttributesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("230a9858a868eb2140c80c8d42270fbf0ea0337e5d8eb0345372a5166edc39fb")
    public
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: CfnMigrationProject.SchemaConversionApplicationAttributesProperty.Builder.() -> Unit)

    public fun sourceDataProviderDescriptors(sourceDataProviderDescriptors: IResolvable)

    public fun sourceDataProviderDescriptors(sourceDataProviderDescriptors: List<Any>)

    public fun sourceDataProviderDescriptors(vararg sourceDataProviderDescriptors: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetDataProviderDescriptors(targetDataProviderDescriptors: IResolvable)

    public fun targetDataProviderDescriptors(targetDataProviderDescriptors: List<Any>)

    public fun targetDataProviderDescriptors(vararg targetDataProviderDescriptors: Any)

    public fun transformationRules(transformationRules: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnMigrationProjectProps.Builder =
        software.amazon.awscdk.services.dms.CfnMigrationProjectProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun instanceProfileArn(instanceProfileArn: String) {
      cdkBuilder.instanceProfileArn(instanceProfileArn)
    }

    override fun instanceProfileIdentifier(instanceProfileIdentifier: String) {
      cdkBuilder.instanceProfileIdentifier(instanceProfileIdentifier)
    }

    override fun instanceProfileName(instanceProfileName: String) {
      cdkBuilder.instanceProfileName(instanceProfileName)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun migrationProjectCreationTime(migrationProjectCreationTime: String) {
      cdkBuilder.migrationProjectCreationTime(migrationProjectCreationTime)
    }

    override fun migrationProjectIdentifier(migrationProjectIdentifier: String) {
      cdkBuilder.migrationProjectIdentifier(migrationProjectIdentifier)
    }

    override fun migrationProjectName(migrationProjectName: String) {
      cdkBuilder.migrationProjectName(migrationProjectName)
    }

    override
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: IResolvable) {
      cdkBuilder.schemaConversionApplicationAttributes(schemaConversionApplicationAttributes.let(IResolvable::unwrap))
    }

    override
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: CfnMigrationProject.SchemaConversionApplicationAttributesProperty) {
      cdkBuilder.schemaConversionApplicationAttributes(schemaConversionApplicationAttributes.let(CfnMigrationProject.SchemaConversionApplicationAttributesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("230a9858a868eb2140c80c8d42270fbf0ea0337e5d8eb0345372a5166edc39fb")
    override
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: CfnMigrationProject.SchemaConversionApplicationAttributesProperty.Builder.() -> Unit):
        Unit =
        schemaConversionApplicationAttributes(CfnMigrationProject.SchemaConversionApplicationAttributesProperty(schemaConversionApplicationAttributes))

    override fun sourceDataProviderDescriptors(sourceDataProviderDescriptors: IResolvable) {
      cdkBuilder.sourceDataProviderDescriptors(sourceDataProviderDescriptors.let(IResolvable::unwrap))
    }

    override fun sourceDataProviderDescriptors(sourceDataProviderDescriptors: List<Any>) {
      cdkBuilder.sourceDataProviderDescriptors(sourceDataProviderDescriptors)
    }

    override fun sourceDataProviderDescriptors(vararg sourceDataProviderDescriptors: Any): Unit =
        sourceDataProviderDescriptors(sourceDataProviderDescriptors.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetDataProviderDescriptors(targetDataProviderDescriptors: IResolvable) {
      cdkBuilder.targetDataProviderDescriptors(targetDataProviderDescriptors.let(IResolvable::unwrap))
    }

    override fun targetDataProviderDescriptors(targetDataProviderDescriptors: List<Any>) {
      cdkBuilder.targetDataProviderDescriptors(targetDataProviderDescriptors)
    }

    override fun targetDataProviderDescriptors(vararg targetDataProviderDescriptors: Any): Unit =
        targetDataProviderDescriptors(targetDataProviderDescriptors.toList())

    override fun transformationRules(transformationRules: String) {
      cdkBuilder.transformationRules(transformationRules)
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnMigrationProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dms.CfnMigrationProjectProps,
  ) : CdkObject(cdkObject), CfnMigrationProjectProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun instanceProfileArn(): String? = unwrap(this).getInstanceProfileArn()

    override fun instanceProfileIdentifier(): String? = unwrap(this).getInstanceProfileIdentifier()

    override fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

    @Deprecated(message = "deprecated in CDK")
    override fun migrationProjectCreationTime(): String? =
        unwrap(this).getMigrationProjectCreationTime()

    override fun migrationProjectIdentifier(): String? =
        unwrap(this).getMigrationProjectIdentifier()

    override fun migrationProjectName(): String? = unwrap(this).getMigrationProjectName()

    override fun schemaConversionApplicationAttributes(): Any? =
        unwrap(this).getSchemaConversionApplicationAttributes()

    override fun sourceDataProviderDescriptors(): Any? =
        unwrap(this).getSourceDataProviderDescriptors()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun targetDataProviderDescriptors(): Any? =
        unwrap(this).getTargetDataProviderDescriptors()

    override fun transformationRules(): String? = unwrap(this).getTransformationRules()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMigrationProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnMigrationProjectProps):
        CfnMigrationProjectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMigrationProjectProps):
        software.amazon.awscdk.services.dms.CfnMigrationProjectProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dms.CfnMigrationProjectProps
  }
}
