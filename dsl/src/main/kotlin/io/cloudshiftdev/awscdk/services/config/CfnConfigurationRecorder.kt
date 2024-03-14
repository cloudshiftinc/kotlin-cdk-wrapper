package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConfigurationRecorder internal constructor(
  private val cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun recordingGroup(): Any? = unwrap(this).getRecordingGroup()

  public open fun recordingGroup(`value`: IResolvable) {
    unwrap(this).setRecordingGroup(`value`.let(IResolvable::unwrap))
  }

  public open fun recordingGroup(`value`: RecordingGroupProperty) {
    unwrap(this).setRecordingGroup(`value`.let(RecordingGroupProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d81d36d616df531c4481129ef27222b12607b0045c300de88782b000b096effb")
  public open fun recordingGroup(`value`: RecordingGroupProperty.Builder.() -> Unit): Unit =
      recordingGroup(RecordingGroupProperty(`value`))

  public open fun recordingMode(): Any? = unwrap(this).getRecordingMode()

  public open fun recordingMode(`value`: IResolvable) {
    unwrap(this).setRecordingMode(`value`.let(IResolvable::unwrap))
  }

  public open fun recordingMode(`value`: RecordingModeProperty) {
    unwrap(this).setRecordingMode(`value`.let(RecordingModeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0a9d8ec9a54119901b41a6b7621459d3e9717792772bfbdc26a080973620387f")
  public open fun recordingMode(`value`: RecordingModeProperty.Builder.() -> Unit): Unit =
      recordingMode(RecordingModeProperty(`value`))

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public interface Builder {
    public fun name(name: String) {
    }

    public fun recordingGroup(recordingGroup: IResolvable) {
    }

    public fun recordingGroup(recordingGroup: RecordingGroupProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b09cf777c91a242656b58a7264175f61c5bb297186f5746c36aaaab39c1b1ec0")
    public fun recordingGroup(recordingGroup: RecordingGroupProperty.Builder.() -> Unit) {
    }

    public fun recordingMode(recordingMode: IResolvable) {
    }

    public fun recordingMode(recordingMode: RecordingModeProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00ffd9c129635aac8d171277a5f2480e3862c30ee64c42d0cee3790005d4a31a")
    public fun recordingMode(recordingMode: RecordingModeProperty.Builder.() -> Unit) {
    }

    public fun roleArn(roleArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnConfigurationRecorder.Builder
        = software.amazon.awscdk.services.config.CfnConfigurationRecorder.Builder.create(scope, id)

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun recordingGroup(recordingGroup: IResolvable) {
      cdkBuilder.recordingGroup(recordingGroup.let(IResolvable::unwrap))
    }

    public override fun recordingGroup(recordingGroup: RecordingGroupProperty) {
      cdkBuilder.recordingGroup(recordingGroup.let(RecordingGroupProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b09cf777c91a242656b58a7264175f61c5bb297186f5746c36aaaab39c1b1ec0")
    public override fun recordingGroup(recordingGroup: RecordingGroupProperty.Builder.() -> Unit):
        Unit = recordingGroup(RecordingGroupProperty(recordingGroup))

    public override fun recordingMode(recordingMode: IResolvable) {
      cdkBuilder.recordingMode(recordingMode.let(IResolvable::unwrap))
    }

    public override fun recordingMode(recordingMode: RecordingModeProperty) {
      cdkBuilder.recordingMode(recordingMode.let(RecordingModeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00ffd9c129635aac8d171277a5f2480e3862c30ee64c42d0cee3790005d4a31a")
    public override fun recordingMode(recordingMode: RecordingModeProperty.Builder.() -> Unit): Unit
        = recordingMode(RecordingModeProperty(recordingMode))

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.config.CfnConfigurationRecorder =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigurationRecorder {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigurationRecorder(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder):
        CfnConfigurationRecorder = CfnConfigurationRecorder(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationRecorder):
        software.amazon.awscdk.services.config.CfnConfigurationRecorder = wrapped.cdkObject
  }

  public interface RecordingModeProperty {
    public fun recordingFrequency(): String

    public fun recordingModeOverrides(): Any? = unwrap(this).getRecordingModeOverrides()

    public interface Builder {
      public fun recordingFrequency(recordingFrequency: String) {
      }

      public fun recordingModeOverrides(recordingModeOverrides: IResolvable) {
      }

      public fun recordingModeOverrides(recordingModeOverrides: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty.builder()

      public override fun recordingFrequency(recordingFrequency: String) {
        cdkBuilder.recordingFrequency(recordingFrequency)
      }

      public override fun recordingModeOverrides(recordingModeOverrides: IResolvable) {
        cdkBuilder.recordingModeOverrides(recordingModeOverrides.let(IResolvable::unwrap))
      }

      public override fun recordingModeOverrides(recordingModeOverrides: List<Any>) {
        cdkBuilder.recordingModeOverrides(recordingModeOverrides)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty,
    ) : RecordingModeProperty {
      public override fun recordingFrequency(): String = unwrap(this).getRecordingFrequency()

      public override fun recordingModeOverrides(): Any? = unwrap(this).getRecordingModeOverrides()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecordingModeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty):
          RecordingModeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordingModeProperty):
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RecordingStrategyProperty {
    public fun useOnly(): String

    public interface Builder {
      public fun useOnly(useOnly: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty.builder()

      public override fun useOnly(useOnly: String) {
        cdkBuilder.useOnly(useOnly)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty,
    ) : RecordingStrategyProperty {
      public override fun useOnly(): String = unwrap(this).getUseOnly()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecordingStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty):
          RecordingStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordingStrategyProperty):
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RecordingGroupProperty {
    public fun allSupported(): Any? = unwrap(this).getAllSupported()

    public fun exclusionByResourceTypes(): Any? = unwrap(this).getExclusionByResourceTypes()

    public fun includeGlobalResourceTypes(): Any? = unwrap(this).getIncludeGlobalResourceTypes()

    public fun recordingStrategy(): Any? = unwrap(this).getRecordingStrategy()

    public fun resourceTypes(): List<String> = unwrap(this).getResourceTypes() ?: emptyList()

    public interface Builder {
      public fun allSupported(allSupported: Boolean) {
      }

      public fun allSupported(allSupported: IResolvable) {
      }

      public fun exclusionByResourceTypes(exclusionByResourceTypes: IResolvable) {
      }

      public
          fun exclusionByResourceTypes(exclusionByResourceTypes: ExclusionByResourceTypesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f27336b188846920bb30023db5d8a8a8808af70358e8d90cb15a76098a0c1937")
      public
          fun exclusionByResourceTypes(exclusionByResourceTypes: ExclusionByResourceTypesProperty.Builder.() -> Unit) {
      }

      public fun includeGlobalResourceTypes(includeGlobalResourceTypes: Boolean) {
      }

      public fun includeGlobalResourceTypes(includeGlobalResourceTypes: IResolvable) {
      }

      public fun recordingStrategy(recordingStrategy: IResolvable) {
      }

      public fun recordingStrategy(recordingStrategy: RecordingStrategyProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1515b32155e4b51fcd151606146580e58457af5e02830e5901331e907f50589")
      public
          fun recordingStrategy(recordingStrategy: RecordingStrategyProperty.Builder.() -> Unit) {
      }

      public fun resourceTypes(resourceTypes: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty.builder()

      public override fun allSupported(allSupported: Boolean) {
        cdkBuilder.allSupported(allSupported)
      }

      public override fun allSupported(allSupported: IResolvable) {
        cdkBuilder.allSupported(allSupported.let(IResolvable::unwrap))
      }

      public override fun exclusionByResourceTypes(exclusionByResourceTypes: IResolvable) {
        cdkBuilder.exclusionByResourceTypes(exclusionByResourceTypes.let(IResolvable::unwrap))
      }

      public override
          fun exclusionByResourceTypes(exclusionByResourceTypes: ExclusionByResourceTypesProperty) {
        cdkBuilder.exclusionByResourceTypes(exclusionByResourceTypes.let(ExclusionByResourceTypesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f27336b188846920bb30023db5d8a8a8808af70358e8d90cb15a76098a0c1937")
      public override
          fun exclusionByResourceTypes(exclusionByResourceTypes: ExclusionByResourceTypesProperty.Builder.() -> Unit):
          Unit =
          exclusionByResourceTypes(ExclusionByResourceTypesProperty(exclusionByResourceTypes))

      public override fun includeGlobalResourceTypes(includeGlobalResourceTypes: Boolean) {
        cdkBuilder.includeGlobalResourceTypes(includeGlobalResourceTypes)
      }

      public override fun includeGlobalResourceTypes(includeGlobalResourceTypes: IResolvable) {
        cdkBuilder.includeGlobalResourceTypes(includeGlobalResourceTypes.let(IResolvable::unwrap))
      }

      public override fun recordingStrategy(recordingStrategy: IResolvable) {
        cdkBuilder.recordingStrategy(recordingStrategy.let(IResolvable::unwrap))
      }

      public override fun recordingStrategy(recordingStrategy: RecordingStrategyProperty) {
        cdkBuilder.recordingStrategy(recordingStrategy.let(RecordingStrategyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1515b32155e4b51fcd151606146580e58457af5e02830e5901331e907f50589")
      public override
          fun recordingStrategy(recordingStrategy: RecordingStrategyProperty.Builder.() -> Unit):
          Unit = recordingStrategy(RecordingStrategyProperty(recordingStrategy))

      public override fun resourceTypes(resourceTypes: List<String>) {
        cdkBuilder.resourceTypes(resourceTypes)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty,
    ) : RecordingGroupProperty {
      public override fun allSupported(): Any? = unwrap(this).getAllSupported()

      public override fun exclusionByResourceTypes(): Any? =
          unwrap(this).getExclusionByResourceTypes()

      public override fun includeGlobalResourceTypes(): Any? =
          unwrap(this).getIncludeGlobalResourceTypes()

      public override fun recordingStrategy(): Any? = unwrap(this).getRecordingStrategy()

      public override fun resourceTypes(): List<String> = unwrap(this).getResourceTypes() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecordingGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty):
          RecordingGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordingGroupProperty):
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ExclusionByResourceTypesProperty {
    public fun resourceTypes(): List<String>

    public interface Builder {
      public fun resourceTypes(resourceTypes: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty.builder()

      public override fun resourceTypes(resourceTypes: List<String>) {
        cdkBuilder.resourceTypes(resourceTypes)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty,
    ) : ExclusionByResourceTypesProperty {
      public override fun resourceTypes(): List<String> = unwrap(this).getResourceTypes() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExclusionByResourceTypesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty):
          ExclusionByResourceTypesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExclusionByResourceTypesProperty):
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RecordingModeOverrideProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun recordingFrequency(): String

    public fun resourceTypes(): List<String>

    public interface Builder {
      public fun description(description: String) {
      }

      public fun recordingFrequency(recordingFrequency: String) {
      }

      public fun resourceTypes(resourceTypes: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty.builder()

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun recordingFrequency(recordingFrequency: String) {
        cdkBuilder.recordingFrequency(recordingFrequency)
      }

      public override fun resourceTypes(resourceTypes: List<String>) {
        cdkBuilder.resourceTypes(resourceTypes)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty,
    ) : RecordingModeOverrideProperty {
      public override fun description(): String? = unwrap(this).getDescription()

      public override fun recordingFrequency(): String = unwrap(this).getRecordingFrequency()

      public override fun resourceTypes(): List<String> = unwrap(this).getResourceTypes() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecordingModeOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty):
          RecordingModeOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordingModeOverrideProperty):
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
