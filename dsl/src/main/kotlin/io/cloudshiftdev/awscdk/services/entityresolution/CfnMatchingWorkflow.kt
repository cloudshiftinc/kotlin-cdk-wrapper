package io.cloudshiftdev.awscdk.services.entityresolution

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMatchingWorkflow internal constructor(
  private val cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow,
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

  public open fun resolutionTechniques(): Any = unwrap(this).getResolutionTechniques()

  public open fun resolutionTechniques(`value`: IResolvable) {
    unwrap(this).setResolutionTechniques(`value`.let(IResolvable::unwrap))
  }

  public open fun resolutionTechniques(`value`: ResolutionTechniquesProperty) {
    unwrap(this).setResolutionTechniques(`value`.let(ResolutionTechniquesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9959af3e7593f9554485292d9da8539898fa0ff19ddd7eb214ec996c58dfc255")
  public open fun resolutionTechniques(`value`: ResolutionTechniquesProperty.Builder.() -> Unit):
      Unit = resolutionTechniques(ResolutionTechniquesProperty(`value`))

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
    public fun description(description: String)

    public fun inputSourceConfig(inputSourceConfig: IResolvable)

    public fun inputSourceConfig(inputSourceConfig: List<Any>)

    public fun outputSourceConfig(outputSourceConfig: IResolvable)

    public fun outputSourceConfig(outputSourceConfig: List<Any>)

    public fun resolutionTechniques(resolutionTechniques: IResolvable)

    public fun resolutionTechniques(resolutionTechniques: ResolutionTechniquesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a12242bc1b27d8c9689dda0dfefcf5d7fd966f70e529f3e77333e4b94f1a9f0e")
    public
        fun resolutionTechniques(resolutionTechniques: ResolutionTechniquesProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun workflowName(workflowName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.Builder =
        software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.Builder.create(scope,
        id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun inputSourceConfig(inputSourceConfig: IResolvable) {
      cdkBuilder.inputSourceConfig(inputSourceConfig.let(IResolvable::unwrap))
    }

    override fun inputSourceConfig(inputSourceConfig: List<Any>) {
      cdkBuilder.inputSourceConfig(inputSourceConfig)
    }

    override fun outputSourceConfig(outputSourceConfig: IResolvable) {
      cdkBuilder.outputSourceConfig(outputSourceConfig.let(IResolvable::unwrap))
    }

    override fun outputSourceConfig(outputSourceConfig: List<Any>) {
      cdkBuilder.outputSourceConfig(outputSourceConfig)
    }

    override fun resolutionTechniques(resolutionTechniques: IResolvable) {
      cdkBuilder.resolutionTechniques(resolutionTechniques.let(IResolvable::unwrap))
    }

    override fun resolutionTechniques(resolutionTechniques: ResolutionTechniquesProperty) {
      cdkBuilder.resolutionTechniques(resolutionTechniques.let(ResolutionTechniquesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a12242bc1b27d8c9689dda0dfefcf5d7fd966f70e529f3e77333e4b94f1a9f0e")
    override
        fun resolutionTechniques(resolutionTechniques: ResolutionTechniquesProperty.Builder.() -> Unit):
        Unit = resolutionTechniques(ResolutionTechniquesProperty(resolutionTechniques))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun workflowName(workflowName: String) {
      cdkBuilder.workflowName(workflowName)
    }

    public fun build(): software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMatchingWorkflow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMatchingWorkflow(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow):
        CfnMatchingWorkflow = CfnMatchingWorkflow(cdkObject)

    internal fun unwrap(wrapped: CfnMatchingWorkflow):
        software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow = wrapped.cdkObject
  }

  public interface RuleBasedPropertiesProperty {
    public fun attributeMatchingModel(): String

    public fun rules(): Any

    public interface Builder {
      public fun attributeMatchingModel(attributeMatchingModel: String)

      public fun rules(rules: IResolvable)

      public fun rules(rules: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleBasedPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleBasedPropertiesProperty.builder()

      override fun attributeMatchingModel(attributeMatchingModel: String) {
        cdkBuilder.attributeMatchingModel(attributeMatchingModel)
      }

      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleBasedPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleBasedPropertiesProperty,
    ) : RuleBasedPropertiesProperty {
      override fun attributeMatchingModel(): String = unwrap(this).getAttributeMatchingModel()

      override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleBasedPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleBasedPropertiesProperty):
          RuleBasedPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleBasedPropertiesProperty):
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleBasedPropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface OutputSourceProperty {
    public fun applyNormalization(): Any? = unwrap(this).getApplyNormalization()

    public fun kmsArn(): String? = unwrap(this).getKmsArn()

    public fun output(): Any

    public fun outputS3Path(): String

    public interface Builder {
      public fun applyNormalization(applyNormalization: Boolean)

      public fun applyNormalization(applyNormalization: IResolvable)

      public fun kmsArn(kmsArn: String)

      public fun output(output: IResolvable)

      public fun output(output: List<Any>)

      public fun outputS3Path(outputS3Path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputSourceProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputSourceProperty.builder()

      override fun applyNormalization(applyNormalization: Boolean) {
        cdkBuilder.applyNormalization(applyNormalization)
      }

      override fun applyNormalization(applyNormalization: IResolvable) {
        cdkBuilder.applyNormalization(applyNormalization.let(IResolvable::unwrap))
      }

      override fun kmsArn(kmsArn: String) {
        cdkBuilder.kmsArn(kmsArn)
      }

      override fun output(output: IResolvable) {
        cdkBuilder.output(output.let(IResolvable::unwrap))
      }

      override fun output(output: List<Any>) {
        cdkBuilder.output(output)
      }

      override fun outputS3Path(outputS3Path: String) {
        cdkBuilder.outputS3Path(outputS3Path)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputSourceProperty,
    ) : OutputSourceProperty {
      override fun applyNormalization(): Any? = unwrap(this).getApplyNormalization()

      override fun kmsArn(): String? = unwrap(this).getKmsArn()

      override fun output(): Any = unwrap(this).getOutput()

      override fun outputS3Path(): String = unwrap(this).getOutputS3Path()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutputSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputSourceProperty):
          OutputSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputSourceProperty):
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputSourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ProviderPropertiesProperty {
    public fun intermediateSourceConfiguration(): Any? =
        unwrap(this).getIntermediateSourceConfiguration()

    public fun providerConfiguration(): Any? = unwrap(this).getProviderConfiguration()

    public fun providerServiceArn(): String

    public interface Builder {
      public fun intermediateSourceConfiguration(intermediateSourceConfiguration: IResolvable)

      public
          fun intermediateSourceConfiguration(intermediateSourceConfiguration: IntermediateSourceConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44b6a1a49cdb72077c62dd50da4e7abffc10e54d5ad4313fd78ba4abdc5b1a15")
      public
          fun intermediateSourceConfiguration(intermediateSourceConfiguration: IntermediateSourceConfigurationProperty.Builder.() -> Unit)

      public fun providerConfiguration(providerConfiguration: IResolvable)

      public fun providerConfiguration(providerConfiguration: Map<String, String>)

      public fun providerServiceArn(providerServiceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ProviderPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ProviderPropertiesProperty.builder()

      override fun intermediateSourceConfiguration(intermediateSourceConfiguration: IResolvable) {
        cdkBuilder.intermediateSourceConfiguration(intermediateSourceConfiguration.let(IResolvable::unwrap))
      }

      override
          fun intermediateSourceConfiguration(intermediateSourceConfiguration: IntermediateSourceConfigurationProperty) {
        cdkBuilder.intermediateSourceConfiguration(intermediateSourceConfiguration.let(IntermediateSourceConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44b6a1a49cdb72077c62dd50da4e7abffc10e54d5ad4313fd78ba4abdc5b1a15")
      override
          fun intermediateSourceConfiguration(intermediateSourceConfiguration: IntermediateSourceConfigurationProperty.Builder.() -> Unit):
          Unit =
          intermediateSourceConfiguration(IntermediateSourceConfigurationProperty(intermediateSourceConfiguration))

      override fun providerConfiguration(providerConfiguration: IResolvable) {
        cdkBuilder.providerConfiguration(providerConfiguration.let(IResolvable::unwrap))
      }

      override fun providerConfiguration(providerConfiguration: Map<String, String>) {
        cdkBuilder.providerConfiguration(providerConfiguration)
      }

      override fun providerServiceArn(providerServiceArn: String) {
        cdkBuilder.providerServiceArn(providerServiceArn)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ProviderPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ProviderPropertiesProperty,
    ) : ProviderPropertiesProperty {
      override fun intermediateSourceConfiguration(): Any? =
          unwrap(this).getIntermediateSourceConfiguration()

      override fun providerConfiguration(): Any? = unwrap(this).getProviderConfiguration()

      override fun providerServiceArn(): String = unwrap(this).getProviderServiceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProviderPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ProviderPropertiesProperty):
          ProviderPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProviderPropertiesProperty):
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ProviderPropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ResolutionTechniquesProperty {
    public fun providerProperties(): Any? = unwrap(this).getProviderProperties()

    public fun resolutionType(): String? = unwrap(this).getResolutionType()

    public fun ruleBasedProperties(): Any? = unwrap(this).getRuleBasedProperties()

    public interface Builder {
      public fun providerProperties(providerProperties: IResolvable)

      public fun providerProperties(providerProperties: ProviderPropertiesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e1873bb6790a95692a48ecbe2d02211a68fb7e870f066de197064e5211312d4")
      public
          fun providerProperties(providerProperties: ProviderPropertiesProperty.Builder.() -> Unit)

      public fun resolutionType(resolutionType: String)

      public fun ruleBasedProperties(ruleBasedProperties: IResolvable)

      public fun ruleBasedProperties(ruleBasedProperties: RuleBasedPropertiesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e25091e8a97032b2c448c5ce58b3d554750bdc070d7440d4c6c2bf477344024")
      public
          fun ruleBasedProperties(ruleBasedProperties: RuleBasedPropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ResolutionTechniquesProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ResolutionTechniquesProperty.builder()

      override fun providerProperties(providerProperties: IResolvable) {
        cdkBuilder.providerProperties(providerProperties.let(IResolvable::unwrap))
      }

      override fun providerProperties(providerProperties: ProviderPropertiesProperty) {
        cdkBuilder.providerProperties(providerProperties.let(ProviderPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e1873bb6790a95692a48ecbe2d02211a68fb7e870f066de197064e5211312d4")
      override
          fun providerProperties(providerProperties: ProviderPropertiesProperty.Builder.() -> Unit):
          Unit = providerProperties(ProviderPropertiesProperty(providerProperties))

      override fun resolutionType(resolutionType: String) {
        cdkBuilder.resolutionType(resolutionType)
      }

      override fun ruleBasedProperties(ruleBasedProperties: IResolvable) {
        cdkBuilder.ruleBasedProperties(ruleBasedProperties.let(IResolvable::unwrap))
      }

      override fun ruleBasedProperties(ruleBasedProperties: RuleBasedPropertiesProperty) {
        cdkBuilder.ruleBasedProperties(ruleBasedProperties.let(RuleBasedPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e25091e8a97032b2c448c5ce58b3d554750bdc070d7440d4c6c2bf477344024")
      override
          fun ruleBasedProperties(ruleBasedProperties: RuleBasedPropertiesProperty.Builder.() -> Unit):
          Unit = ruleBasedProperties(RuleBasedPropertiesProperty(ruleBasedProperties))

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ResolutionTechniquesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ResolutionTechniquesProperty,
    ) : ResolutionTechniquesProperty {
      override fun providerProperties(): Any? = unwrap(this).getProviderProperties()

      override fun resolutionType(): String? = unwrap(this).getResolutionType()

      override fun ruleBasedProperties(): Any? = unwrap(this).getRuleBasedProperties()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResolutionTechniquesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ResolutionTechniquesProperty):
          ResolutionTechniquesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResolutionTechniquesProperty):
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ResolutionTechniquesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputSourceProperty {
    public fun applyNormalization(): Any? = unwrap(this).getApplyNormalization()

    public fun inputSourceArn(): String

    public fun schemaArn(): String

    public interface Builder {
      public fun applyNormalization(applyNormalization: Boolean)

      public fun applyNormalization(applyNormalization: IResolvable)

      public fun inputSourceArn(inputSourceArn: String)

      public fun schemaArn(schemaArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.InputSourceProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.InputSourceProperty.builder()

      override fun applyNormalization(applyNormalization: Boolean) {
        cdkBuilder.applyNormalization(applyNormalization)
      }

      override fun applyNormalization(applyNormalization: IResolvable) {
        cdkBuilder.applyNormalization(applyNormalization.let(IResolvable::unwrap))
      }

      override fun inputSourceArn(inputSourceArn: String) {
        cdkBuilder.inputSourceArn(inputSourceArn)
      }

      override fun schemaArn(schemaArn: String) {
        cdkBuilder.schemaArn(schemaArn)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.InputSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.InputSourceProperty,
    ) : InputSourceProperty {
      override fun applyNormalization(): Any? = unwrap(this).getApplyNormalization()

      override fun inputSourceArn(): String = unwrap(this).getInputSourceArn()

      override fun schemaArn(): String = unwrap(this).getSchemaArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.InputSourceProperty):
          InputSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputSourceProperty):
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.InputSourceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface IntermediateSourceConfigurationProperty {
    public fun intermediateS3Path(): String

    public interface Builder {
      public fun intermediateS3Path(intermediateS3Path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.IntermediateSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.IntermediateSourceConfigurationProperty.builder()

      override fun intermediateS3Path(intermediateS3Path: String) {
        cdkBuilder.intermediateS3Path(intermediateS3Path)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.IntermediateSourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.IntermediateSourceConfigurationProperty,
    ) : IntermediateSourceConfigurationProperty {
      override fun intermediateS3Path(): String = unwrap(this).getIntermediateS3Path()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.IntermediateSourceConfigurationProperty):
          IntermediateSourceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntermediateSourceConfigurationProperty):
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.IntermediateSourceConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface OutputAttributeProperty {
    public fun hashed(): Any? = unwrap(this).getHashed()

    public fun name(): String

    public interface Builder {
      public fun hashed(hashed: Boolean)

      public fun hashed(hashed: IResolvable)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputAttributeProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputAttributeProperty.builder()

      override fun hashed(hashed: Boolean) {
        cdkBuilder.hashed(hashed)
      }

      override fun hashed(hashed: IResolvable) {
        cdkBuilder.hashed(hashed.let(IResolvable::unwrap))
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputAttributeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputAttributeProperty,
    ) : OutputAttributeProperty {
      override fun hashed(): Any? = unwrap(this).getHashed()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutputAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputAttributeProperty):
          OutputAttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputAttributeProperty):
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputAttributeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RuleProperty {
    public fun matchingKeys(): List<String>

    public fun ruleName(): String

    public interface Builder {
      public fun matchingKeys(matchingKeys: List<String>)

      public fun ruleName(ruleName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleProperty.builder()

      override fun matchingKeys(matchingKeys: List<String>) {
        cdkBuilder.matchingKeys(matchingKeys)
      }

      override fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleProperty,
    ) : RuleProperty {
      override fun matchingKeys(): List<String> = unwrap(this).getMatchingKeys() ?: emptyList()

      override fun ruleName(): String = unwrap(this).getRuleName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleProperty):
          RuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
