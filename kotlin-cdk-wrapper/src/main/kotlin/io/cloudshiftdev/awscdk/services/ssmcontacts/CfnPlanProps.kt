@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmcontacts

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPlanProps {
  public fun contactId(): String

  public fun rotationIds(): List<String> = unwrap(this).getRotationIds() ?: emptyList()

  public fun stages(): Any? = unwrap(this).getStages()

  @CdkDslMarker
  public interface Builder {
    public fun contactId(contactId: String)

    public fun rotationIds(rotationIds: List<String>)

    public fun rotationIds(vararg rotationIds: String)

    public fun stages(stages: IResolvable)

    public fun stages(stages: List<Any>)

    public fun stages(vararg stages: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssmcontacts.CfnPlanProps.Builder =
        software.amazon.awscdk.services.ssmcontacts.CfnPlanProps.builder()

    override fun contactId(contactId: String) {
      cdkBuilder.contactId(contactId)
    }

    override fun rotationIds(rotationIds: List<String>) {
      cdkBuilder.rotationIds(rotationIds)
    }

    override fun rotationIds(vararg rotationIds: String): Unit = rotationIds(rotationIds.toList())

    override fun stages(stages: IResolvable) {
      cdkBuilder.stages(stages.let(IResolvable::unwrap))
    }

    override fun stages(stages: List<Any>) {
      cdkBuilder.stages(stages)
    }

    override fun stages(vararg stages: Any): Unit = stages(stages.toList())

    public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnPlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlanProps,
  ) : CdkObject(cdkObject), CfnPlanProps {
    override fun contactId(): String = unwrap(this).getContactId()

    override fun rotationIds(): List<String> = unwrap(this).getRotationIds() ?: emptyList()

    override fun stages(): Any? = unwrap(this).getStages()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlanProps):
        CfnPlanProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPlanProps):
        software.amazon.awscdk.services.ssmcontacts.CfnPlanProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ssmcontacts.CfnPlanProps
  }
}
