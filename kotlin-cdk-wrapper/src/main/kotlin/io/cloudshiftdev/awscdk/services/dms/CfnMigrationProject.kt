@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMigrationProject internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.dms.CfnMigrationProject,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrMigrationProjectArn(): String = unwrap(this).getAttrMigrationProjectArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceProfileArn(): String? = unwrap(this).getInstanceProfileArn()

  public open fun instanceProfileArn(`value`: String) {
    unwrap(this).setInstanceProfileArn(`value`)
  }

  public open fun instanceProfileIdentifier(): String? = unwrap(this).getInstanceProfileIdentifier()

  public open fun instanceProfileIdentifier(`value`: String) {
    unwrap(this).setInstanceProfileIdentifier(`value`)
  }

  public open fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

  public open fun instanceProfileName(`value`: String) {
    unwrap(this).setInstanceProfileName(`value`)
  }

  @Deprecated(message = "deprecated in CDK")
  public open fun migrationProjectCreationTime(): String? =
      unwrap(this).getMigrationProjectCreationTime()

  @Deprecated(message = "deprecated in CDK")
  public open fun migrationProjectCreationTime(`value`: String) {
    unwrap(this).setMigrationProjectCreationTime(`value`)
  }

  public open fun migrationProjectIdentifier(): String? =
      unwrap(this).getMigrationProjectIdentifier()

  public open fun migrationProjectIdentifier(`value`: String) {
    unwrap(this).setMigrationProjectIdentifier(`value`)
  }

  public open fun migrationProjectName(): String? = unwrap(this).getMigrationProjectName()

  public open fun migrationProjectName(`value`: String) {
    unwrap(this).setMigrationProjectName(`value`)
  }

  public open fun schemaConversionApplicationAttributes(): Any? =
      unwrap(this).getSchemaConversionApplicationAttributes()

  public open fun schemaConversionApplicationAttributes(`value`: IResolvable) {
    unwrap(this).setSchemaConversionApplicationAttributes(`value`.let(IResolvable::unwrap))
  }

  public open
      fun schemaConversionApplicationAttributes(`value`: SchemaConversionApplicationAttributesProperty) {
    unwrap(this).setSchemaConversionApplicationAttributes(`value`.let(SchemaConversionApplicationAttributesProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c7dc53d07f0b30c5f1f7fb91859546ac2e3b8e7d3b0687bb1f1813d1229780fb")
  public open
      fun schemaConversionApplicationAttributes(`value`: SchemaConversionApplicationAttributesProperty.Builder.() -> Unit):
      Unit =
      schemaConversionApplicationAttributes(SchemaConversionApplicationAttributesProperty(`value`))

  public open fun sourceDataProviderDescriptors(): Any? =
      unwrap(this).getSourceDataProviderDescriptors()

  public open fun sourceDataProviderDescriptors(`value`: IResolvable) {
    unwrap(this).setSourceDataProviderDescriptors(`value`.let(IResolvable::unwrap))
  }

  public open fun sourceDataProviderDescriptors(__idx_ac66f0: List<Any>) {
    unwrap(this).setSourceDataProviderDescriptors(__idx_ac66f0)
  }

  public open fun sourceDataProviderDescriptors(vararg __idx_ac66f0: Any): Unit =
      sourceDataProviderDescriptors(__idx_ac66f0.toList())

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public open fun targetDataProviderDescriptors(): Any? =
      unwrap(this).getTargetDataProviderDescriptors()

  public open fun targetDataProviderDescriptors(`value`: IResolvable) {
    unwrap(this).setTargetDataProviderDescriptors(`value`.let(IResolvable::unwrap))
  }

  public open fun targetDataProviderDescriptors(__idx_ac66f0: List<Any>) {
    unwrap(this).setTargetDataProviderDescriptors(__idx_ac66f0)
  }

  public open fun targetDataProviderDescriptors(vararg __idx_ac66f0: Any): Unit =
      targetDataProviderDescriptors(__idx_ac66f0.toList())

  public open fun transformationRules(): String? = unwrap(this).getTransformationRules()

  public open fun transformationRules(`value`: String) {
    unwrap(this).setTransformationRules(`value`)
  }

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
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: SchemaConversionApplicationAttributesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84a92f567083155da430c6daef80fa05ef799b413046f64455802538986c4714")
    public
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: SchemaConversionApplicationAttributesProperty.Builder.() -> Unit)

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnMigrationProject.Builder =
        software.amazon.awscdk.services.dms.CfnMigrationProject.Builder.create(scope, id)

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
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: SchemaConversionApplicationAttributesProperty) {
      cdkBuilder.schemaConversionApplicationAttributes(schemaConversionApplicationAttributes.let(SchemaConversionApplicationAttributesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84a92f567083155da430c6daef80fa05ef799b413046f64455802538986c4714")
    override
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: SchemaConversionApplicationAttributesProperty.Builder.() -> Unit):
        Unit =
        schemaConversionApplicationAttributes(SchemaConversionApplicationAttributesProperty(schemaConversionApplicationAttributes))

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

    public fun build(): software.amazon.awscdk.services.dms.CfnMigrationProject = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.dms.CfnMigrationProject.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMigrationProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMigrationProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnMigrationProject):
        CfnMigrationProject = CfnMigrationProject(cdkObject)

    internal fun unwrap(wrapped: CfnMigrationProject):
        software.amazon.awscdk.services.dms.CfnMigrationProject = wrapped.cdkObject
  }

  public interface DataProviderDescriptorProperty {
    public fun dataProviderArn(): String? = unwrap(this).getDataProviderArn()

    public fun dataProviderIdentifier(): String? = unwrap(this).getDataProviderIdentifier()

    public fun dataProviderName(): String? = unwrap(this).getDataProviderName()

    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    @CdkDslMarker
    public interface Builder {
      public fun dataProviderArn(dataProviderArn: String)

      public fun dataProviderIdentifier(dataProviderIdentifier: String)

      public fun dataProviderName(dataProviderName: String)

      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      public fun secretsManagerSecretId(secretsManagerSecretId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnMigrationProject.DataProviderDescriptorProperty.Builder
          =
          software.amazon.awscdk.services.dms.CfnMigrationProject.DataProviderDescriptorProperty.builder()

      override fun dataProviderArn(dataProviderArn: String) {
        cdkBuilder.dataProviderArn(dataProviderArn)
      }

      override fun dataProviderIdentifier(dataProviderIdentifier: String) {
        cdkBuilder.dataProviderIdentifier(dataProviderIdentifier)
      }

      override fun dataProviderName(dataProviderName: String) {
        cdkBuilder.dataProviderName(dataProviderName)
      }

      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      public fun build():
          software.amazon.awscdk.services.dms.CfnMigrationProject.DataProviderDescriptorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dms.CfnMigrationProject.DataProviderDescriptorProperty,
    ) : CdkObject(cdkObject), DataProviderDescriptorProperty {
      override fun dataProviderArn(): String? = unwrap(this).getDataProviderArn()

      override fun dataProviderIdentifier(): String? = unwrap(this).getDataProviderIdentifier()

      override fun dataProviderName(): String? = unwrap(this).getDataProviderName()

      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataProviderDescriptorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnMigrationProject.DataProviderDescriptorProperty):
          DataProviderDescriptorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataProviderDescriptorProperty):
          software.amazon.awscdk.services.dms.CfnMigrationProject.DataProviderDescriptorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnMigrationProject.DataProviderDescriptorProperty
    }
  }

  public interface SchemaConversionApplicationAttributesProperty {
    public fun s3BucketPath(): String? = unwrap(this).getS3BucketPath()

    public fun s3BucketRoleArn(): String? = unwrap(this).getS3BucketRoleArn()

    @CdkDslMarker
    public interface Builder {
      public fun s3BucketPath(s3BucketPath: String)

      public fun s3BucketRoleArn(s3BucketRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnMigrationProject.SchemaConversionApplicationAttributesProperty.Builder
          =
          software.amazon.awscdk.services.dms.CfnMigrationProject.SchemaConversionApplicationAttributesProperty.builder()

      override fun s3BucketPath(s3BucketPath: String) {
        cdkBuilder.s3BucketPath(s3BucketPath)
      }

      override fun s3BucketRoleArn(s3BucketRoleArn: String) {
        cdkBuilder.s3BucketRoleArn(s3BucketRoleArn)
      }

      public fun build():
          software.amazon.awscdk.services.dms.CfnMigrationProject.SchemaConversionApplicationAttributesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dms.CfnMigrationProject.SchemaConversionApplicationAttributesProperty,
    ) : CdkObject(cdkObject), SchemaConversionApplicationAttributesProperty {
      override fun s3BucketPath(): String? = unwrap(this).getS3BucketPath()

      override fun s3BucketRoleArn(): String? = unwrap(this).getS3BucketRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SchemaConversionApplicationAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnMigrationProject.SchemaConversionApplicationAttributesProperty):
          SchemaConversionApplicationAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaConversionApplicationAttributesProperty):
          software.amazon.awscdk.services.dms.CfnMigrationProject.SchemaConversionApplicationAttributesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnMigrationProject.SchemaConversionApplicationAttributesProperty
    }
  }
}
