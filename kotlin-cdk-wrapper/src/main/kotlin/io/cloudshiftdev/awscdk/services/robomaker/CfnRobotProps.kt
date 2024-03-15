@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnRobotProps {
  public fun architecture(): String

  public fun fleet(): String? = unwrap(this).getFleet()

  public fun greengrassGroupId(): String

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun architecture(architecture: String)

    public fun fleet(fleet: String)

    public fun greengrassGroupId(greengrassGroupId: String)

    public fun name(name: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.robomaker.CfnRobotProps.Builder =
        software.amazon.awscdk.services.robomaker.CfnRobotProps.builder()

    override fun architecture(architecture: String) {
      cdkBuilder.architecture(architecture)
    }

    override fun fleet(fleet: String) {
      cdkBuilder.fleet(fleet)
    }

    override fun greengrassGroupId(greengrassGroupId: String) {
      cdkBuilder.greengrassGroupId(greengrassGroupId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.robomaker.CfnRobotProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.robomaker.CfnRobotProps,
  ) : CdkObject(cdkObject), CfnRobotProps {
    override fun architecture(): String = unwrap(this).getArchitecture()

    override fun fleet(): String? = unwrap(this).getFleet()

    override fun greengrassGroupId(): String = unwrap(this).getGreengrassGroupId()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRobotProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnRobotProps):
        CfnRobotProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRobotProps):
        software.amazon.awscdk.services.robomaker.CfnRobotProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.robomaker.CfnRobotProps
  }
}
