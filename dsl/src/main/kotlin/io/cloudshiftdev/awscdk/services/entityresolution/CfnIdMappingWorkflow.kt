package io.cloudshiftdev.awscdk.services.entityresolution

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIdMappingWorkflow internal constructor(
  private val cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  public open fun attrWorkflowArn(): String = unwrap(this).getAttrWorkflowArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun idMappingTechniques(): Any = unwrap(this).getIdMappingTechniques()

  public open fun idMappingTechniques(`value`: IResolvable) {
    unwrap(this).setIdMappingTechniques(`value`.let(IResolvable::unwrap))
  }

  public open fun idMappingTechniques(`value`: IdMappingTechniquesProperty) {
    unwrap(this).setIdMappingTechniques(`value`.let(IdMappingTechniquesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0dcdc7b99155a327aacc2b9686f29ba8ddb2d40d91243b25a35673b625517f95")
  public open fun idMappingTechniques(`value`: IdMappingTechniquesProperty.Builder.() -> Unit): Unit
      = idMappingTechniques(IdMappingTechniquesProperty(`value`))

  public open fun inputSourceConfig(): Any = unwrap(this).getInputSourceConfig()

  public open fun inputSourceConfig(`value`: IResolvable) {
    unwrap(this).setInputSourceConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun inputSourceConfig(__idx_ac66f0: List<Any>) {
    unwrap(this).setInputSourceConfig(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun outputSourceConfig(): Any = unwrap(this).getOutputSourceConfig()

  public open fun outputSourceConfig(`value`: IResolvable) {
    unwrap(this).setOutputSourceConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun outputSourceConfig(__idx_ac66f0: List<Any>) {
    unwrap(this).setOutputSourceConfig(__idx_ac66f0)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun workflowName(): String = unwrap(this).getWorkflowName()

  public open fun workflowName(`value`: String) {
    unwrap(this).setWorkflowName(`value`)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun idMappingTechniques(idMappingTechniques: IResolvable) {
    }

    public fun idMappingTechniques(idMappingTechniques: IdMappingTechniquesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adf133ccc4d3eb2dd97e1dc0865da29cc2840795e113f053f00da756e475a701")
    public
        fun idMappingTechniques(idMappingTechniques: IdMappingTechniquesProperty.Builder.() -> Unit) {
    }

    public fun inputSourceConfig(inputSourceConfig: IResolvable) {
    }

    public fun inputSourceConfig(inputSourceConfig: List<Any>) {
    }

    public fun outputSourceConfig(outputSourceConfig: IResolvable) {
    }

    public fun outputSourceConfig(outputSourceConfig: List<Any>) {
    }

    public fun roleArn(roleArn: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun workflowName(workflowName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.Builder =
        software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.Builder.create(scope,
        id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun idMappingTechniques(idMappingTechniques: IResolvable) {
      cdkBuilder.idMappingTechniques(idMappingTechniques.let(IResolvable::unwrap))
    }

    public override fun idMappingTechniques(idMappingTechniques: IdMappingTechniquesProperty) {
      cdkBuilder.idMappingTechniques(idMappingTechniques.let(IdMappingTechniquesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adf133ccc4d3eb2dd97e1dc0865da29cc2840795e113f053f00da756e475a701")
    public override
        fun idMappingTechniques(idMappingTechniques: IdMappingTechniquesProperty.Builder.() -> Unit):
        Unit = idMappingTechniques(IdMappingTechniquesProperty(idMappingTechniques))

    public override fun inputSourceConfig(inputSourceConfig: IResolvable) {
      cdkBuilder.inputSourceConfig(inputSourceConfig.let(IResolvable::unwrap))
    }

    public override fun inputSourceConfig(inputSourceConfig: List<Any>) {
      cdkBuilder.inputSourceConfig(inputSourceConfig)
    }

    public override fun outputSourceConfig(outputSourceConfig: IResolvable) {
      cdkBuilder.outputSourceConfig(outputSourceConfig.let(IResolvable::unwrap))
    }

    public override fun outputSourceConfig(outputSourceConfig: List<Any>) {
      cdkBuilder.outputSourceConfig(outputSourceConfig)
    }

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun workflowName(workflowName: String) {
      cdkBuilder.workflowName(workflowName)
    }

    public fun build(): software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIdMappingWorkflow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIdMappingWorkflow(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow):
        CfnIdMappingWorkflow = CfnIdMappingWorkflow(cdkObject)

    internal fun unwrap(wrapped: CfnIdMappingWorkflow):
        software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow = wrapped.cdkObject
  }

  public interface IdMappingWorkflowOutputSourceProperty {
    public fun kmsArn(): String? = unwrap(this).getKmsArn()

    public fun outputS3Path(): String

    public interface Builder {
      public fun kmsArn(kmsArn: String) {
      }

      public fun outputS3Path(outputS3Path: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty.builder()

      public override fun kmsArn(kmsArn: String) {
        cdkBuilder.kmsArn(kmsArn)
      }

      public override fun outputS3Path(outputS3Path: String) {
        cdkBuilder.outputS3Path(outputS3Path)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty,
    ) : IdMappingWorkflowOutputSourceProperty {
      public override fun kmsArn(): String? = unwrap(this).getKmsArn()

      public override fun outputS3Path(): String = unwrap(this).getOutputS3Path()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          IdMappingWorkflowOutputSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty):
          IdMappingWorkflowOutputSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdMappingWorkflowOutputSourceProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface IdMappingTechniquesProperty {
    public fun idMappingType(): String? = unwrap(this).getIdMappingType()

    public fun providerProperties(): Any? = unwrap(this).getProviderProperties()

    public interface Builder {
      public fun idMappingType(idMappingType: String) {
      }

      public fun providerProperties(providerProperties: IResolvable) {
      }

      public fun providerProperties(providerProperties: ProviderPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99e7e4a7a6322b76ecdd8c18747c700ce11a2af0f1fbf4624e4560278e5486a8")
      public
          fun providerProperties(providerProperties: ProviderPropertiesProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingTechniquesProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingTechniquesProperty.builder()

      public override fun idMappingType(idMappingType: String) {
        cdkBuilder.idMappingType(idMappingType)
      }

      public override fun providerProperties(providerProperties: IResolvable) {
        cdkBuilder.providerProperties(providerProperties.let(IResolvable::unwrap))
      }

      public override fun providerProperties(providerProperties: ProviderPropertiesProperty) {
        cdkBuilder.providerProperties(providerProperties.let(ProviderPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99e7e4a7a6322b76ecdd8c18747c700ce11a2af0f1fbf4624e4560278e5486a8")
      public override
          fun providerProperties(providerProperties: ProviderPropertiesProperty.Builder.() -> Unit):
          Unit = providerProperties(ProviderPropertiesProperty(providerProperties))

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingTechniquesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingTechniquesProperty,
    ) : IdMappingTechniquesProperty {
      public override fun idMappingType(): String? = unwrap(this).getIdMappingType()

      public override fun providerProperties(): Any? = unwrap(this).getProviderProperties()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IdMappingTechniquesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingTechniquesProperty):
          IdMappingTechniquesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdMappingTechniquesProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingTechniquesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface IdMappingWorkflowInputSourceProperty {
    public fun inputSourceArn(): String

    public fun schemaArn(): String

    public interface Builder {
      public fun inputSourceArn(inputSourceArn: String) {
      }

      public fun schemaArn(schemaArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty.builder()

      public override fun inputSourceArn(inputSourceArn: String) {
        cdkBuilder.inputSourceArn(inputSourceArn)
      }

      public override fun schemaArn(schemaArn: String) {
        cdkBuilder.schemaArn(schemaArn)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty,
    ) : IdMappingWorkflowInputSourceProperty {
      public override fun inputSourceArn(): String = unwrap(this).getInputSourceArn()

      public override fun schemaArn(): String = unwrap(this).getSchemaArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          IdMappingWorkflowInputSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty):
          IdMappingWorkflowInputSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdMappingWorkflowInputSourceProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ProviderPropertiesProperty {
    public fun intermediateSourceConfiguration(): Any? =
        unwrap(this).getIntermediateSourceConfiguration()

    public fun providerConfiguration(): Any? = unwrap(this).getProviderConfiguration()

    public fun providerServiceArn(): String

    public interface Builder {
      public fun intermediateSourceConfiguration(intermediateSourceConfiguration: IResolvable) {
      }

      public
          fun intermediateSourceConfiguration(intermediateSourceConfiguration: IntermediateSourceConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("feeb44c32e5e169bbc20b86683c24e01fa5232b3c89a44934e6a49038df773fd")
      public
          fun intermediateSourceConfiguration(intermediateSourceConfiguration: IntermediateSourceConfigurationProperty.Builder.() -> Unit) {
      }

      public fun providerConfiguration(providerConfiguration: IResolvable) {
      }

      public fun providerConfiguration(providerConfiguration: Map<String, String>) {
      }

      public fun providerServiceArn(providerServiceArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.ProviderPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.ProviderPropertiesProperty.builder()

      public override
          fun intermediateSourceConfiguration(intermediateSourceConfiguration: IResolvable) {
        cdkBuilder.intermediateSourceConfiguration(intermediateSourceConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun intermediateSourceConfiguration(intermediateSourceConfiguration: IntermediateSourceConfigurationProperty) {
        cdkBuilder.intermediateSourceConfiguration(intermediateSourceConfiguration.let(IntermediateSourceConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("feeb44c32e5e169bbc20b86683c24e01fa5232b3c89a44934e6a49038df773fd")
      public override
          fun intermediateSourceConfiguration(intermediateSourceConfiguration: IntermediateSourceConfigurationProperty.Builder.() -> Unit):
          Unit =
          intermediateSourceConfiguration(IntermediateSourceConfigurationProperty(intermediateSourceConfiguration))

      public override fun providerConfiguration(providerConfiguration: IResolvable) {
        cdkBuilder.providerConfiguration(providerConfiguration.let(IResolvable::unwrap))
      }

      public override fun providerConfiguration(providerConfiguration: Map<String, String>) {
        cdkBuilder.providerConfiguration(providerConfiguration)
      }

      public override fun providerServiceArn(providerServiceArn: String) {
        cdkBuilder.providerServiceArn(providerServiceArn)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.ProviderPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.ProviderPropertiesProperty,
    ) : ProviderPropertiesProperty {
      public override fun intermediateSourceConfiguration(): Any? =
          unwrap(this).getIntermediateSourceConfiguration()

      public override fun providerConfiguration(): Any? = unwrap(this).getProviderConfiguration()

      public override fun providerServiceArn(): String = unwrap(this).getProviderServiceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProviderPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.ProviderPropertiesProperty):
          ProviderPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProviderPropertiesProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.ProviderPropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface IntermediateSourceConfigurationProperty {
    public fun intermediateS3Path(): String

    public interface Builder {
      public fun intermediateS3Path(intermediateS3Path: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty.builder()

      public override fun intermediateS3Path(intermediateS3Path: String) {
        cdkBuilder.intermediateS3Path(intermediateS3Path)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty,
    ) : IntermediateSourceConfigurationProperty {
      public override fun intermediateS3Path(): String = unwrap(this).getIntermediateS3Path()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          IntermediateSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty):
          IntermediateSourceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntermediateSourceConfigurationProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
