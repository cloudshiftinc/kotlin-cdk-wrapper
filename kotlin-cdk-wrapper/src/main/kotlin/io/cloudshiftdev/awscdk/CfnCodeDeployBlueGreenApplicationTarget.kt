@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnCodeDeployBlueGreenApplicationTarget {
  public fun logicalId(): String

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun logicalId(logicalId: String)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget.Builder =
        software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget.builder()

    override fun logicalId(logicalId: String) {
      cdkBuilder.logicalId(logicalId)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget,
  ) : CdkObject(cdkObject), CfnCodeDeployBlueGreenApplicationTarget {
    override fun logicalId(): String = unwrap(this).getLogicalId()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnCodeDeployBlueGreenApplicationTarget {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget):
        CfnCodeDeployBlueGreenApplicationTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCodeDeployBlueGreenApplicationTarget):
        software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget
  }
}
