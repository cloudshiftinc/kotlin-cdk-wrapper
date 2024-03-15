@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.arczonalshift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnZonalAutoshiftConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun practiceRunConfiguration(): Any? = unwrap(this).getPracticeRunConfiguration()

  public open fun practiceRunConfiguration(`value`: IResolvable) {
    unwrap(this).setPracticeRunConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun practiceRunConfiguration(`value`: PracticeRunConfigurationProperty) {
    unwrap(this).setPracticeRunConfiguration(`value`.let(PracticeRunConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("17281cf35a06f4949d3135c29e87bad5eb2456f109c2d9ec865147db883ab099")
  public open
      fun practiceRunConfiguration(`value`: PracticeRunConfigurationProperty.Builder.() -> Unit):
      Unit = practiceRunConfiguration(PracticeRunConfigurationProperty(`value`))

  public open fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  public open fun resourceIdentifier(`value`: String) {
    unwrap(this).setResourceIdentifier(`value`)
  }

  public open fun zonalAutoshiftStatus(): String? = unwrap(this).getZonalAutoshiftStatus()

  public open fun zonalAutoshiftStatus(`value`: String) {
    unwrap(this).setZonalAutoshiftStatus(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun practiceRunConfiguration(practiceRunConfiguration: IResolvable)

    public fun practiceRunConfiguration(practiceRunConfiguration: PracticeRunConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44e23cd0c76947b4a98fd46ae201caf0ff99e65f2768fdc876aade01a8be9e92")
    public
        fun practiceRunConfiguration(practiceRunConfiguration: PracticeRunConfigurationProperty.Builder.() -> Unit)

    public fun resourceIdentifier(resourceIdentifier: String)

    public fun zonalAutoshiftStatus(zonalAutoshiftStatus: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.Builder =
        software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.Builder.create(scope,
        id)

    override fun practiceRunConfiguration(practiceRunConfiguration: IResolvable) {
      cdkBuilder.practiceRunConfiguration(practiceRunConfiguration.let(IResolvable::unwrap))
    }

    override
        fun practiceRunConfiguration(practiceRunConfiguration: PracticeRunConfigurationProperty) {
      cdkBuilder.practiceRunConfiguration(practiceRunConfiguration.let(PracticeRunConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44e23cd0c76947b4a98fd46ae201caf0ff99e65f2768fdc876aade01a8be9e92")
    override
        fun practiceRunConfiguration(practiceRunConfiguration: PracticeRunConfigurationProperty.Builder.() -> Unit):
        Unit = practiceRunConfiguration(PracticeRunConfigurationProperty(practiceRunConfiguration))

    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    override fun zonalAutoshiftStatus(zonalAutoshiftStatus: String) {
      cdkBuilder.zonalAutoshiftStatus(zonalAutoshiftStatus)
    }

    public fun build(): software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration
        = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnZonalAutoshiftConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnZonalAutoshiftConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration):
        CfnZonalAutoshiftConfiguration = CfnZonalAutoshiftConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnZonalAutoshiftConfiguration):
        software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration =
        wrapped.cdkObject
  }

  public interface PracticeRunConfigurationProperty {
    public fun blockedDates(): List<String> = unwrap(this).getBlockedDates() ?: emptyList()

    public fun blockedWindows(): List<String> = unwrap(this).getBlockedWindows() ?: emptyList()

    public fun blockingAlarms(): Any? = unwrap(this).getBlockingAlarms()

    public fun outcomeAlarms(): Any

    @CdkDslMarker
    public interface Builder {
      public fun blockedDates(blockedDates: List<String>)

      public fun blockedDates(vararg blockedDates: String)

      public fun blockedWindows(blockedWindows: List<String>)

      public fun blockedWindows(vararg blockedWindows: String)

      public fun blockingAlarms(blockingAlarms: IResolvable)

      public fun blockingAlarms(blockingAlarms: List<Any>)

      public fun blockingAlarms(vararg blockingAlarms: Any)

      public fun outcomeAlarms(outcomeAlarms: IResolvable)

      public fun outcomeAlarms(outcomeAlarms: List<Any>)

      public fun outcomeAlarms(vararg outcomeAlarms: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty.builder()

      override fun blockedDates(blockedDates: List<String>) {
        cdkBuilder.blockedDates(blockedDates)
      }

      override fun blockedDates(vararg blockedDates: String): Unit =
          blockedDates(blockedDates.toList())

      override fun blockedWindows(blockedWindows: List<String>) {
        cdkBuilder.blockedWindows(blockedWindows)
      }

      override fun blockedWindows(vararg blockedWindows: String): Unit =
          blockedWindows(blockedWindows.toList())

      override fun blockingAlarms(blockingAlarms: IResolvable) {
        cdkBuilder.blockingAlarms(blockingAlarms.let(IResolvable::unwrap))
      }

      override fun blockingAlarms(blockingAlarms: List<Any>) {
        cdkBuilder.blockingAlarms(blockingAlarms)
      }

      override fun blockingAlarms(vararg blockingAlarms: Any): Unit =
          blockingAlarms(blockingAlarms.toList())

      override fun outcomeAlarms(outcomeAlarms: IResolvable) {
        cdkBuilder.outcomeAlarms(outcomeAlarms.let(IResolvable::unwrap))
      }

      override fun outcomeAlarms(outcomeAlarms: List<Any>) {
        cdkBuilder.outcomeAlarms(outcomeAlarms)
      }

      override fun outcomeAlarms(vararg outcomeAlarms: Any): Unit =
          outcomeAlarms(outcomeAlarms.toList())

      public fun build():
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty,
    ) : CdkObject(cdkObject), PracticeRunConfigurationProperty {
      override fun blockedDates(): List<String> = unwrap(this).getBlockedDates() ?: emptyList()

      override fun blockedWindows(): List<String> = unwrap(this).getBlockedWindows() ?: emptyList()

      override fun blockingAlarms(): Any? = unwrap(this).getBlockingAlarms()

      override fun outcomeAlarms(): Any = unwrap(this).getOutcomeAlarms()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PracticeRunConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty):
          PracticeRunConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PracticeRunConfigurationProperty):
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty
    }
  }

  public interface ControlConditionProperty {
    public fun alarmIdentifier(): String

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun alarmIdentifier(alarmIdentifier: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.ControlConditionProperty.Builder
          =
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.ControlConditionProperty.builder()

      override fun alarmIdentifier(alarmIdentifier: String) {
        cdkBuilder.alarmIdentifier(alarmIdentifier)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.ControlConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.ControlConditionProperty,
    ) : CdkObject(cdkObject), ControlConditionProperty {
      override fun alarmIdentifier(): String = unwrap(this).getAlarmIdentifier()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ControlConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.ControlConditionProperty):
          ControlConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ControlConditionProperty):
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.ControlConditionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.ControlConditionProperty
    }
  }
}
