@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.evidently

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnProjectProps {
  public fun appConfigResource(): Any? = unwrap(this).getAppConfigResource()

  public fun dataDelivery(): Any? = unwrap(this).getDataDelivery()

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun appConfigResource(appConfigResource: IResolvable)

    public fun appConfigResource(appConfigResource: CfnProject.AppConfigResourceObjectProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cfa9b878a7eea503632ef02e8b1103004e7a75d461872fb10b042611630a1a7")
    public
        fun appConfigResource(appConfigResource: CfnProject.AppConfigResourceObjectProperty.Builder.() -> Unit)

    public fun dataDelivery(dataDelivery: IResolvable)

    public fun dataDelivery(dataDelivery: CfnProject.DataDeliveryObjectProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("832cfa508b5226c3f1ddb84e2425e9ea6fbf85d942f716e2647898566466bc0d")
    public fun dataDelivery(dataDelivery: CfnProject.DataDeliveryObjectProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evidently.CfnProjectProps.Builder =
        software.amazon.awscdk.services.evidently.CfnProjectProps.builder()

    override fun appConfigResource(appConfigResource: IResolvable) {
      cdkBuilder.appConfigResource(appConfigResource.let(IResolvable::unwrap))
    }

    override fun appConfigResource(appConfigResource: CfnProject.AppConfigResourceObjectProperty) {
      cdkBuilder.appConfigResource(appConfigResource.let(CfnProject.AppConfigResourceObjectProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cfa9b878a7eea503632ef02e8b1103004e7a75d461872fb10b042611630a1a7")
    override
        fun appConfigResource(appConfigResource: CfnProject.AppConfigResourceObjectProperty.Builder.() -> Unit):
        Unit = appConfigResource(CfnProject.AppConfigResourceObjectProperty(appConfigResource))

    override fun dataDelivery(dataDelivery: IResolvable) {
      cdkBuilder.dataDelivery(dataDelivery.let(IResolvable::unwrap))
    }

    override fun dataDelivery(dataDelivery: CfnProject.DataDeliveryObjectProperty) {
      cdkBuilder.dataDelivery(dataDelivery.let(CfnProject.DataDeliveryObjectProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("832cfa508b5226c3f1ddb84e2425e9ea6fbf85d942f716e2647898566466bc0d")
    override
        fun dataDelivery(dataDelivery: CfnProject.DataDeliveryObjectProperty.Builder.() -> Unit):
        Unit = dataDelivery(CfnProject.DataDeliveryObjectProperty(dataDelivery))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.evidently.CfnProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.evidently.CfnProjectProps,
  ) : CdkObject(cdkObject), CfnProjectProps {
    override fun appConfigResource(): Any? = unwrap(this).getAppConfigResource()

    override fun dataDelivery(): Any? = unwrap(this).getDataDelivery()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnProjectProps):
        CfnProjectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProjectProps):
        software.amazon.awscdk.services.evidently.CfnProjectProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.evidently.CfnProjectProps
  }
}
