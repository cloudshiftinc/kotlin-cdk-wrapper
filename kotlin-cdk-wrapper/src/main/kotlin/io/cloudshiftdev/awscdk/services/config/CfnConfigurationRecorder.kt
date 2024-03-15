@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConfigurationRecorder internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder,
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0a9d8ec9a54119901b41a6b7621459d3e9717792772bfbdc26a080973620387f")
  public open fun recordingMode(`value`: RecordingModeProperty.Builder.() -> Unit): Unit =
      recordingMode(RecordingModeProperty(`value`))

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun recordingGroup(recordingGroup: IResolvable)

    public fun recordingGroup(recordingGroup: RecordingGroupProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b09cf777c91a242656b58a7264175f61c5bb297186f5746c36aaaab39c1b1ec0")
    public fun recordingGroup(recordingGroup: RecordingGroupProperty.Builder.() -> Unit)

    public fun recordingMode(recordingMode: IResolvable)

    public fun recordingMode(recordingMode: RecordingModeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00ffd9c129635aac8d171277a5f2480e3862c30ee64c42d0cee3790005d4a31a")
    public fun recordingMode(recordingMode: RecordingModeProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnConfigurationRecorder.Builder
        = software.amazon.awscdk.services.config.CfnConfigurationRecorder.Builder.create(scope, id)

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun recordingGroup(recordingGroup: IResolvable) {
      cdkBuilder.recordingGroup(recordingGroup.let(IResolvable::unwrap))
    }

    override fun recordingGroup(recordingGroup: RecordingGroupProperty) {
      cdkBuilder.recordingGroup(recordingGroup.let(RecordingGroupProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b09cf777c91a242656b58a7264175f61c5bb297186f5746c36aaaab39c1b1ec0")
    override fun recordingGroup(recordingGroup: RecordingGroupProperty.Builder.() -> Unit): Unit =
        recordingGroup(RecordingGroupProperty(recordingGroup))

    override fun recordingMode(recordingMode: IResolvable) {
      cdkBuilder.recordingMode(recordingMode.let(IResolvable::unwrap))
    }

    override fun recordingMode(recordingMode: RecordingModeProperty) {
      cdkBuilder.recordingMode(recordingMode.let(RecordingModeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00ffd9c129635aac8d171277a5f2480e3862c30ee64c42d0cee3790005d4a31a")
    override fun recordingMode(recordingMode: RecordingModeProperty.Builder.() -> Unit): Unit =
        recordingMode(RecordingModeProperty(recordingMode))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.config.CfnConfigurationRecorder =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.config.CfnConfigurationRecorder.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun recordingFrequency(recordingFrequency: String)

      public fun recordingModeOverrides(recordingModeOverrides: IResolvable)

      public fun recordingModeOverrides(recordingModeOverrides: List<Any>)

      public fun recordingModeOverrides(vararg recordingModeOverrides: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty.builder()

      override fun recordingFrequency(recordingFrequency: String) {
        cdkBuilder.recordingFrequency(recordingFrequency)
      }

      override fun recordingModeOverrides(recordingModeOverrides: IResolvable) {
        cdkBuilder.recordingModeOverrides(recordingModeOverrides.let(IResolvable::unwrap))
      }

      override fun recordingModeOverrides(recordingModeOverrides: List<Any>) {
        cdkBuilder.recordingModeOverrides(recordingModeOverrides)
      }

      override fun recordingModeOverrides(vararg recordingModeOverrides: Any): Unit =
          recordingModeOverrides(recordingModeOverrides.toList())

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty,
    ) : CdkObject(cdkObject), RecordingModeProperty {
      override fun recordingFrequency(): String = unwrap(this).getRecordingFrequency()

      override fun recordingModeOverrides(): Any? = unwrap(this).getRecordingModeOverrides()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecordingModeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty):
          RecordingModeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordingModeProperty):
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty
    }
  }

  public interface RecordingStrategyProperty {
    public fun useOnly(): String

    @CdkDslMarker
    public interface Builder {
      public fun useOnly(useOnly: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty.builder()

      override fun useOnly(useOnly: String) {
        cdkBuilder.useOnly(useOnly)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty,
    ) : CdkObject(cdkObject), RecordingStrategyProperty {
      override fun useOnly(): String = unwrap(this).getUseOnly()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecordingStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty):
          RecordingStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordingStrategyProperty):
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty
    }
  }

  public interface RecordingGroupProperty {
    public fun allSupported(): Any? = unwrap(this).getAllSupported()

    public fun exclusionByResourceTypes(): Any? = unwrap(this).getExclusionByResourceTypes()

    public fun includeGlobalResourceTypes(): Any? = unwrap(this).getIncludeGlobalResourceTypes()

    public fun recordingStrategy(): Any? = unwrap(this).getRecordingStrategy()

    public fun resourceTypes(): List<String> = unwrap(this).getResourceTypes() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun allSupported(allSupported: Boolean)

      public fun allSupported(allSupported: IResolvable)

      public fun exclusionByResourceTypes(exclusionByResourceTypes: IResolvable)

      public
          fun exclusionByResourceTypes(exclusionByResourceTypes: ExclusionByResourceTypesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f27336b188846920bb30023db5d8a8a8808af70358e8d90cb15a76098a0c1937")
      public
          fun exclusionByResourceTypes(exclusionByResourceTypes: ExclusionByResourceTypesProperty.Builder.() -> Unit)

      public fun includeGlobalResourceTypes(includeGlobalResourceTypes: Boolean)

      public fun includeGlobalResourceTypes(includeGlobalResourceTypes: IResolvable)

      public fun recordingStrategy(recordingStrategy: IResolvable)

      public fun recordingStrategy(recordingStrategy: RecordingStrategyProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1515b32155e4b51fcd151606146580e58457af5e02830e5901331e907f50589")
      public fun recordingStrategy(recordingStrategy: RecordingStrategyProperty.Builder.() -> Unit)

      public fun resourceTypes(resourceTypes: List<String>)

      public fun resourceTypes(vararg resourceTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty.builder()

      override fun allSupported(allSupported: Boolean) {
        cdkBuilder.allSupported(allSupported)
      }

      override fun allSupported(allSupported: IResolvable) {
        cdkBuilder.allSupported(allSupported.let(IResolvable::unwrap))
      }

      override fun exclusionByResourceTypes(exclusionByResourceTypes: IResolvable) {
        cdkBuilder.exclusionByResourceTypes(exclusionByResourceTypes.let(IResolvable::unwrap))
      }

      override
          fun exclusionByResourceTypes(exclusionByResourceTypes: ExclusionByResourceTypesProperty) {
        cdkBuilder.exclusionByResourceTypes(exclusionByResourceTypes.let(ExclusionByResourceTypesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f27336b188846920bb30023db5d8a8a8808af70358e8d90cb15a76098a0c1937")
      override
          fun exclusionByResourceTypes(exclusionByResourceTypes: ExclusionByResourceTypesProperty.Builder.() -> Unit):
          Unit =
          exclusionByResourceTypes(ExclusionByResourceTypesProperty(exclusionByResourceTypes))

      override fun includeGlobalResourceTypes(includeGlobalResourceTypes: Boolean) {
        cdkBuilder.includeGlobalResourceTypes(includeGlobalResourceTypes)
      }

      override fun includeGlobalResourceTypes(includeGlobalResourceTypes: IResolvable) {
        cdkBuilder.includeGlobalResourceTypes(includeGlobalResourceTypes.let(IResolvable::unwrap))
      }

      override fun recordingStrategy(recordingStrategy: IResolvable) {
        cdkBuilder.recordingStrategy(recordingStrategy.let(IResolvable::unwrap))
      }

      override fun recordingStrategy(recordingStrategy: RecordingStrategyProperty) {
        cdkBuilder.recordingStrategy(recordingStrategy.let(RecordingStrategyProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1515b32155e4b51fcd151606146580e58457af5e02830e5901331e907f50589")
      override
          fun recordingStrategy(recordingStrategy: RecordingStrategyProperty.Builder.() -> Unit):
          Unit = recordingStrategy(RecordingStrategyProperty(recordingStrategy))

      override fun resourceTypes(resourceTypes: List<String>) {
        cdkBuilder.resourceTypes(resourceTypes)
      }

      override fun resourceTypes(vararg resourceTypes: String): Unit =
          resourceTypes(resourceTypes.toList())

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty,
    ) : CdkObject(cdkObject), RecordingGroupProperty {
      override fun allSupported(): Any? = unwrap(this).getAllSupported()

      override fun exclusionByResourceTypes(): Any? = unwrap(this).getExclusionByResourceTypes()

      override fun includeGlobalResourceTypes(): Any? = unwrap(this).getIncludeGlobalResourceTypes()

      override fun recordingStrategy(): Any? = unwrap(this).getRecordingStrategy()

      override fun resourceTypes(): List<String> = unwrap(this).getResourceTypes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecordingGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty):
          RecordingGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordingGroupProperty):
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty
    }
  }

  public interface ExclusionByResourceTypesProperty {
    public fun resourceTypes(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun resourceTypes(resourceTypes: List<String>)

      public fun resourceTypes(vararg resourceTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty.builder()

      override fun resourceTypes(resourceTypes: List<String>) {
        cdkBuilder.resourceTypes(resourceTypes)
      }

      override fun resourceTypes(vararg resourceTypes: String): Unit =
          resourceTypes(resourceTypes.toList())

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty,
    ) : CdkObject(cdkObject), ExclusionByResourceTypesProperty {
      override fun resourceTypes(): List<String> = unwrap(this).getResourceTypes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExclusionByResourceTypesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty):
          ExclusionByResourceTypesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExclusionByResourceTypesProperty):
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty
    }
  }

  public interface RecordingModeOverrideProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun recordingFrequency(): String

    public fun resourceTypes(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun description(description: String)

      public fun recordingFrequency(recordingFrequency: String)

      public fun resourceTypes(resourceTypes: List<String>)

      public fun resourceTypes(vararg resourceTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty.builder()

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun recordingFrequency(recordingFrequency: String) {
        cdkBuilder.recordingFrequency(recordingFrequency)
      }

      override fun resourceTypes(resourceTypes: List<String>) {
        cdkBuilder.resourceTypes(resourceTypes)
      }

      override fun resourceTypes(vararg resourceTypes: String): Unit =
          resourceTypes(resourceTypes.toList())

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty,
    ) : CdkObject(cdkObject), RecordingModeOverrideProperty {
      override fun description(): String? = unwrap(this).getDescription()

      override fun recordingFrequency(): String = unwrap(this).getRecordingFrequency()

      override fun resourceTypes(): List<String> = unwrap(this).getResourceTypes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecordingModeOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty):
          RecordingModeOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordingModeOverrideProperty):
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty
    }
  }
}