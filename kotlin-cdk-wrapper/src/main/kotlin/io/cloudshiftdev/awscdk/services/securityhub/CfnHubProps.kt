@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnHubProps {
  public fun autoEnableControls(): Any? = unwrap(this).getAutoEnableControls()

  public fun controlFindingGenerator(): String? = unwrap(this).getControlFindingGenerator()

  public fun enableDefaultStandards(): Any? = unwrap(this).getEnableDefaultStandards()

  public fun tags(): Any? = unwrap(this).getTags()

  @CdkDslMarker
  public interface Builder {
    public fun autoEnableControls(autoEnableControls: Boolean)

    public fun autoEnableControls(autoEnableControls: IResolvable)

    public fun controlFindingGenerator(controlFindingGenerator: String)

    public fun enableDefaultStandards(enableDefaultStandards: Boolean)

    public fun enableDefaultStandards(enableDefaultStandards: IResolvable)

    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnHubProps.Builder =
        software.amazon.awscdk.services.securityhub.CfnHubProps.builder()

    override fun autoEnableControls(autoEnableControls: Boolean) {
      cdkBuilder.autoEnableControls(autoEnableControls)
    }

    override fun autoEnableControls(autoEnableControls: IResolvable) {
      cdkBuilder.autoEnableControls(autoEnableControls.let(IResolvable::unwrap))
    }

    override fun controlFindingGenerator(controlFindingGenerator: String) {
      cdkBuilder.controlFindingGenerator(controlFindingGenerator)
    }

    override fun enableDefaultStandards(enableDefaultStandards: Boolean) {
      cdkBuilder.enableDefaultStandards(enableDefaultStandards)
    }

    override fun enableDefaultStandards(enableDefaultStandards: IResolvable) {
      cdkBuilder.enableDefaultStandards(enableDefaultStandards.let(IResolvable::unwrap))
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnHubProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.securityhub.CfnHubProps,
  ) : CdkObject(cdkObject), CfnHubProps {
    override fun autoEnableControls(): Any? = unwrap(this).getAutoEnableControls()

    override fun controlFindingGenerator(): String? = unwrap(this).getControlFindingGenerator()

    override fun enableDefaultStandards(): Any? = unwrap(this).getEnableDefaultStandards()

    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHubProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnHubProps):
        CfnHubProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHubProps):
        software.amazon.awscdk.services.securityhub.CfnHubProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.securityhub.CfnHubProps
  }
}
