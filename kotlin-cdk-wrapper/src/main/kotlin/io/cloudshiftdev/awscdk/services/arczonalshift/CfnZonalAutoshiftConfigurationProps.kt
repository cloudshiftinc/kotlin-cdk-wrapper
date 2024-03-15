@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.arczonalshift

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnZonalAutoshiftConfigurationProps {
  public fun practiceRunConfiguration(): Any? = unwrap(this).getPracticeRunConfiguration()

  public fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  public fun zonalAutoshiftStatus(): String? = unwrap(this).getZonalAutoshiftStatus()

  @CdkDslMarker
  public interface Builder {
    public fun practiceRunConfiguration(practiceRunConfiguration: IResolvable)

    public
        fun practiceRunConfiguration(practiceRunConfiguration: CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d78d32780a518765b544f3967d14c8f2f047636439ee9805eaa1ec40078c914")
    public
        fun practiceRunConfiguration(practiceRunConfiguration: CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty.Builder.() -> Unit)

    public fun resourceIdentifier(resourceIdentifier: String)

    public fun zonalAutoshiftStatus(zonalAutoshiftStatus: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfigurationProps.Builder =
        software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfigurationProps.builder()

    override fun practiceRunConfiguration(practiceRunConfiguration: IResolvable) {
      cdkBuilder.practiceRunConfiguration(practiceRunConfiguration.let(IResolvable::unwrap))
    }

    override
        fun practiceRunConfiguration(practiceRunConfiguration: CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty) {
      cdkBuilder.practiceRunConfiguration(practiceRunConfiguration.let(CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d78d32780a518765b544f3967d14c8f2f047636439ee9805eaa1ec40078c914")
    override
        fun practiceRunConfiguration(practiceRunConfiguration: CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty.Builder.() -> Unit):
        Unit =
        practiceRunConfiguration(CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty(practiceRunConfiguration))

    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    override fun zonalAutoshiftStatus(zonalAutoshiftStatus: String) {
      cdkBuilder.zonalAutoshiftStatus(zonalAutoshiftStatus)
    }

    public fun build():
        software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfigurationProps,
  ) : CdkObject(cdkObject), CfnZonalAutoshiftConfigurationProps {
    override fun practiceRunConfiguration(): Any? = unwrap(this).getPracticeRunConfiguration()

    override fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

    override fun zonalAutoshiftStatus(): String? = unwrap(this).getZonalAutoshiftStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnZonalAutoshiftConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfigurationProps):
        CfnZonalAutoshiftConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnZonalAutoshiftConfigurationProps):
        software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfigurationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfigurationProps
  }
}
