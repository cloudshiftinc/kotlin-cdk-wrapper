package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCapacityProvider internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.CfnCapacityProvider,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun autoScalingGroupProvider(): Any = unwrap(this).getAutoScalingGroupProvider()

  public open fun autoScalingGroupProvider(`value`: IResolvable) {
    unwrap(this).setAutoScalingGroupProvider(`value`.let(IResolvable::unwrap))
  }

  public open fun autoScalingGroupProvider(`value`: AutoScalingGroupProviderProperty) {
    unwrap(this).setAutoScalingGroupProvider(`value`.let(AutoScalingGroupProviderProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a09c71815f1b32891bb321b5a27de0167df5db0db904175466e47c9341c7c097")
  public open
      fun autoScalingGroupProvider(`value`: AutoScalingGroupProviderProperty.Builder.() -> Unit):
      Unit = autoScalingGroupProvider(AutoScalingGroupProviderProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun autoScalingGroupProvider(autoScalingGroupProvider: IResolvable)

    public fun autoScalingGroupProvider(autoScalingGroupProvider: AutoScalingGroupProviderProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68422f447be91b9c3be8c755876526eb33f3c5b41cae3e978f5f6d9e0be64f83")
    public
        fun autoScalingGroupProvider(autoScalingGroupProvider: AutoScalingGroupProviderProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnCapacityProvider.Builder =
        software.amazon.awscdk.services.ecs.CfnCapacityProvider.Builder.create(scope, id)

    override fun autoScalingGroupProvider(autoScalingGroupProvider: IResolvable) {
      cdkBuilder.autoScalingGroupProvider(autoScalingGroupProvider.let(IResolvable::unwrap))
    }

    override
        fun autoScalingGroupProvider(autoScalingGroupProvider: AutoScalingGroupProviderProperty) {
      cdkBuilder.autoScalingGroupProvider(autoScalingGroupProvider.let(AutoScalingGroupProviderProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68422f447be91b9c3be8c755876526eb33f3c5b41cae3e978f5f6d9e0be64f83")
    override
        fun autoScalingGroupProvider(autoScalingGroupProvider: AutoScalingGroupProviderProperty.Builder.() -> Unit):
        Unit = autoScalingGroupProvider(AutoScalingGroupProviderProperty(autoScalingGroupProvider))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.CfnCapacityProvider = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCapacityProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCapacityProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCapacityProvider):
        CfnCapacityProvider = CfnCapacityProvider(cdkObject)

    internal fun unwrap(wrapped: CfnCapacityProvider):
        software.amazon.awscdk.services.ecs.CfnCapacityProvider = wrapped.cdkObject
  }

  public interface ManagedScalingProperty {
    public fun instanceWarmupPeriod(): Number? = unwrap(this).getInstanceWarmupPeriod()

    public fun maximumScalingStepSize(): Number? = unwrap(this).getMaximumScalingStepSize()

    public fun minimumScalingStepSize(): Number? = unwrap(this).getMinimumScalingStepSize()

    public fun status(): String? = unwrap(this).getStatus()

    public fun targetCapacity(): Number? = unwrap(this).getTargetCapacity()

    public interface Builder {
      public fun instanceWarmupPeriod(instanceWarmupPeriod: Number)

      public fun maximumScalingStepSize(maximumScalingStepSize: Number)

      public fun minimumScalingStepSize(minimumScalingStepSize: Number)

      public fun status(status: String)

      public fun targetCapacity(targetCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.ManagedScalingProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.ManagedScalingProperty.builder()

      override fun instanceWarmupPeriod(instanceWarmupPeriod: Number) {
        cdkBuilder.instanceWarmupPeriod(instanceWarmupPeriod)
      }

      override fun maximumScalingStepSize(maximumScalingStepSize: Number) {
        cdkBuilder.maximumScalingStepSize(maximumScalingStepSize)
      }

      override fun minimumScalingStepSize(minimumScalingStepSize: Number) {
        cdkBuilder.minimumScalingStepSize(minimumScalingStepSize)
      }

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      override fun targetCapacity(targetCapacity: Number) {
        cdkBuilder.targetCapacity(targetCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.ManagedScalingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.ManagedScalingProperty,
    ) : ManagedScalingProperty {
      override fun instanceWarmupPeriod(): Number? = unwrap(this).getInstanceWarmupPeriod()

      override fun maximumScalingStepSize(): Number? = unwrap(this).getMaximumScalingStepSize()

      override fun minimumScalingStepSize(): Number? = unwrap(this).getMinimumScalingStepSize()

      override fun status(): String? = unwrap(this).getStatus()

      override fun targetCapacity(): Number? = unwrap(this).getTargetCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ManagedScalingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCapacityProvider.ManagedScalingProperty):
          ManagedScalingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedScalingProperty):
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.ManagedScalingProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AutoScalingGroupProviderProperty {
    public fun autoScalingGroupArn(): String

    public fun managedDraining(): String? = unwrap(this).getManagedDraining()

    public fun managedScaling(): Any? = unwrap(this).getManagedScaling()

    public fun managedTerminationProtection(): String? =
        unwrap(this).getManagedTerminationProtection()

    public interface Builder {
      public fun autoScalingGroupArn(autoScalingGroupArn: String)

      public fun managedDraining(managedDraining: String)

      public fun managedScaling(managedScaling: IResolvable)

      public fun managedScaling(managedScaling: ManagedScalingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44931cd342e50c37549dae89b6cbbe6b4f5f8ec40770076d154685503c77bd15")
      public fun managedScaling(managedScaling: ManagedScalingProperty.Builder.() -> Unit)

      public fun managedTerminationProtection(managedTerminationProtection: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty.builder()

      override fun autoScalingGroupArn(autoScalingGroupArn: String) {
        cdkBuilder.autoScalingGroupArn(autoScalingGroupArn)
      }

      override fun managedDraining(managedDraining: String) {
        cdkBuilder.managedDraining(managedDraining)
      }

      override fun managedScaling(managedScaling: IResolvable) {
        cdkBuilder.managedScaling(managedScaling.let(IResolvable::unwrap))
      }

      override fun managedScaling(managedScaling: ManagedScalingProperty) {
        cdkBuilder.managedScaling(managedScaling.let(ManagedScalingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44931cd342e50c37549dae89b6cbbe6b4f5f8ec40770076d154685503c77bd15")
      override fun managedScaling(managedScaling: ManagedScalingProperty.Builder.() -> Unit): Unit =
          managedScaling(ManagedScalingProperty(managedScaling))

      override fun managedTerminationProtection(managedTerminationProtection: String) {
        cdkBuilder.managedTerminationProtection(managedTerminationProtection)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty,
    ) : AutoScalingGroupProviderProperty {
      override fun autoScalingGroupArn(): String = unwrap(this).getAutoScalingGroupArn()

      override fun managedDraining(): String? = unwrap(this).getManagedDraining()

      override fun managedScaling(): Any? = unwrap(this).getManagedScaling()

      override fun managedTerminationProtection(): String? =
          unwrap(this).getManagedTerminationProtection()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingGroupProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty):
          AutoScalingGroupProviderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingGroupProviderProperty):
          software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
