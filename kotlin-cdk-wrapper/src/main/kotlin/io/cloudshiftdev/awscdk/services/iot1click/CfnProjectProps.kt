@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot1click

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnProjectProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun placementTemplate(): Any

  public fun projectName(): String? = unwrap(this).getProjectName()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun placementTemplate(placementTemplate: IResolvable)

    public fun placementTemplate(placementTemplate: CfnProject.PlacementTemplateProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("711c77e633b457a35fadf1453a24c72a6b8db410a655f53352c3104af65182ce")
    public
        fun placementTemplate(placementTemplate: CfnProject.PlacementTemplateProperty.Builder.() -> Unit)

    public fun projectName(projectName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot1click.CfnProjectProps.Builder =
        software.amazon.awscdk.services.iot1click.CfnProjectProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun placementTemplate(placementTemplate: IResolvable) {
      cdkBuilder.placementTemplate(placementTemplate.let(IResolvable::unwrap))
    }

    override fun placementTemplate(placementTemplate: CfnProject.PlacementTemplateProperty) {
      cdkBuilder.placementTemplate(placementTemplate.let(CfnProject.PlacementTemplateProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("711c77e633b457a35fadf1453a24c72a6b8db410a655f53352c3104af65182ce")
    override
        fun placementTemplate(placementTemplate: CfnProject.PlacementTemplateProperty.Builder.() -> Unit):
        Unit = placementTemplate(CfnProject.PlacementTemplateProperty(placementTemplate))

    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    public fun build(): software.amazon.awscdk.services.iot1click.CfnProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot1click.CfnProjectProps,
  ) : CdkObject(cdkObject), CfnProjectProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun placementTemplate(): Any = unwrap(this).getPlacementTemplate()

    override fun projectName(): String? = unwrap(this).getProjectName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot1click.CfnProjectProps):
        CfnProjectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProjectProps):
        software.amazon.awscdk.services.iot1click.CfnProjectProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iot1click.CfnProjectProps
  }
}
