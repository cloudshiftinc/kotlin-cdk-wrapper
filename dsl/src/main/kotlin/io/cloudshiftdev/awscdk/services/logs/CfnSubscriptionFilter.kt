package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSubscriptionFilter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.logs.CfnSubscriptionFilter,
) : CfnResource(cdkObject), IInspectable {
  public open fun destinationArn(): String = unwrap(this).getDestinationArn()

  public open fun destinationArn(`value`: String) {
    unwrap(this).setDestinationArn(`value`)
  }

  public open fun distribution(): String? = unwrap(this).getDistribution()

  public open fun distribution(`value`: String) {
    unwrap(this).setDistribution(`value`)
  }

  public open fun filterName(): String? = unwrap(this).getFilterName()

  public open fun filterName(`value`: String) {
    unwrap(this).setFilterName(`value`)
  }

  public open fun filterPattern(): String = unwrap(this).getFilterPattern()

  public open fun filterPattern(`value`: String) {
    unwrap(this).setFilterPattern(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logGroupName(): String = unwrap(this).getLogGroupName()

  public open fun logGroupName(`value`: String) {
    unwrap(this).setLogGroupName(`value`)
  }

  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public interface Builder {
    public fun destinationArn(destinationArn: String) {
    }

    public fun distribution(distribution: String) {
    }

    public fun filterName(filterName: String) {
    }

    public fun filterPattern(filterPattern: String) {
    }

    public fun logGroupName(logGroupName: String) {
    }

    public fun roleArn(roleArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnSubscriptionFilter.Builder =
        software.amazon.awscdk.services.logs.CfnSubscriptionFilter.Builder.create(scope, id)

    public override fun destinationArn(destinationArn: String) {
      cdkBuilder.destinationArn(destinationArn)
    }

    public override fun distribution(distribution: String) {
      cdkBuilder.distribution(distribution)
    }

    public override fun filterName(filterName: String) {
      cdkBuilder.filterName(filterName)
    }

    public override fun filterPattern(filterPattern: String) {
      cdkBuilder.filterPattern(filterPattern)
    }

    public override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnSubscriptionFilter =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubscriptionFilter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubscriptionFilter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnSubscriptionFilter):
        CfnSubscriptionFilter = CfnSubscriptionFilter(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriptionFilter):
        software.amazon.awscdk.services.logs.CfnSubscriptionFilter = wrapped.cdkObject
  }
}
