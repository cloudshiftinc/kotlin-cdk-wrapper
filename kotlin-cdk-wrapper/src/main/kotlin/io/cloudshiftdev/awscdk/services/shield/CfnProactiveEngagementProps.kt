@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.shield

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnProactiveEngagementProps {
  public fun emergencyContactList(): Any

  public fun proactiveEngagementStatus(): String

  @CdkDslMarker
  public interface Builder {
    public fun emergencyContactList(emergencyContactList: IResolvable)

    public fun emergencyContactList(emergencyContactList: List<Any>)

    public fun emergencyContactList(vararg emergencyContactList: Any)

    public fun proactiveEngagementStatus(proactiveEngagementStatus: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.shield.CfnProactiveEngagementProps.Builder =
        software.amazon.awscdk.services.shield.CfnProactiveEngagementProps.builder()

    override fun emergencyContactList(emergencyContactList: IResolvable) {
      cdkBuilder.emergencyContactList(emergencyContactList.let(IResolvable::unwrap))
    }

    override fun emergencyContactList(emergencyContactList: List<Any>) {
      cdkBuilder.emergencyContactList(emergencyContactList)
    }

    override fun emergencyContactList(vararg emergencyContactList: Any): Unit =
        emergencyContactList(emergencyContactList.toList())

    override fun proactiveEngagementStatus(proactiveEngagementStatus: String) {
      cdkBuilder.proactiveEngagementStatus(proactiveEngagementStatus)
    }

    public fun build(): software.amazon.awscdk.services.shield.CfnProactiveEngagementProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.shield.CfnProactiveEngagementProps,
  ) : CdkObject(cdkObject), CfnProactiveEngagementProps {
    override fun emergencyContactList(): Any = unwrap(this).getEmergencyContactList()

    override fun proactiveEngagementStatus(): String = unwrap(this).getProactiveEngagementStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProactiveEngagementProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.shield.CfnProactiveEngagementProps):
        CfnProactiveEngagementProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProactiveEngagementProps):
        software.amazon.awscdk.services.shield.CfnProactiveEngagementProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.shield.CfnProactiveEngagementProps
  }
}
