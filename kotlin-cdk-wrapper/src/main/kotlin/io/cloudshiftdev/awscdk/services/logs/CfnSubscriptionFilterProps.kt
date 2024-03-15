@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnSubscriptionFilterProps {
  public fun destinationArn(): String

  public fun distribution(): String? = unwrap(this).getDistribution()

  public fun filterName(): String? = unwrap(this).getFilterName()

  public fun filterPattern(): String

  public fun logGroupName(): String

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  @CdkDslMarker
  public interface Builder {
    public fun destinationArn(destinationArn: String)

    public fun distribution(distribution: String)

    public fun filterName(filterName: String)

    public fun filterPattern(filterPattern: String)

    public fun logGroupName(logGroupName: String)

    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps.Builder
        = software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps.builder()

    override fun destinationArn(destinationArn: String) {
      cdkBuilder.destinationArn(destinationArn)
    }

    override fun distribution(distribution: String) {
      cdkBuilder.distribution(distribution)
    }

    override fun filterName(filterName: String) {
      cdkBuilder.filterName(filterName)
    }

    override fun filterPattern(filterPattern: String) {
      cdkBuilder.filterPattern(filterPattern)
    }

    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps,
  ) : CdkObject(cdkObject), CfnSubscriptionFilterProps {
    override fun destinationArn(): String = unwrap(this).getDestinationArn()

    override fun distribution(): String? = unwrap(this).getDistribution()

    override fun filterName(): String? = unwrap(this).getFilterName()

    override fun filterPattern(): String = unwrap(this).getFilterPattern()

    override fun logGroupName(): String = unwrap(this).getLogGroupName()

    override fun roleArn(): String? = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSubscriptionFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps):
        CfnSubscriptionFilterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriptionFilterProps):
        software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps
  }
}
