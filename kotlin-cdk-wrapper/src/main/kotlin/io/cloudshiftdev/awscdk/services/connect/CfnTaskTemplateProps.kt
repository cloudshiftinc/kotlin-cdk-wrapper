@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTaskTemplateProps {
  public fun clientToken(): String? = unwrap(this).getClientToken()

  public fun constraints(): Any? = unwrap(this).getConstraints()

  public fun contactFlowArn(): String? = unwrap(this).getContactFlowArn()

  public fun defaults(): Any? = unwrap(this).getDefaults()

  public fun description(): String? = unwrap(this).getDescription()

  public fun fields(): Any? = unwrap(this).getFields()

  public fun instanceArn(): String

  public fun name(): String? = unwrap(this).getName()

  public fun status(): String? = unwrap(this).getStatus()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun clientToken(clientToken: String)

    public fun constraints(constraints: Any)

    public fun contactFlowArn(contactFlowArn: String)

    public fun defaults(defaults: IResolvable)

    public fun defaults(defaults: List<Any>)

    public fun defaults(vararg defaults: Any)

    public fun description(description: String)

    public fun fields(fields: IResolvable)

    public fun fields(fields: List<Any>)

    public fun fields(vararg fields: Any)

    public fun instanceArn(instanceArn: String)

    public fun name(name: String)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnTaskTemplateProps.Builder =
        software.amazon.awscdk.services.connect.CfnTaskTemplateProps.builder()

    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    override fun constraints(constraints: Any) {
      cdkBuilder.constraints(constraints)
    }

    override fun contactFlowArn(contactFlowArn: String) {
      cdkBuilder.contactFlowArn(contactFlowArn)
    }

    override fun defaults(defaults: IResolvable) {
      cdkBuilder.defaults(defaults.let(IResolvable::unwrap))
    }

    override fun defaults(defaults: List<Any>) {
      cdkBuilder.defaults(defaults)
    }

    override fun defaults(vararg defaults: Any): Unit = defaults(defaults.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun fields(fields: IResolvable) {
      cdkBuilder.fields(fields.let(IResolvable::unwrap))
    }

    override fun fields(fields: List<Any>) {
      cdkBuilder.fields(fields)
    }

    override fun fields(vararg fields: Any): Unit = fields(fields.toList())

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnTaskTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplateProps,
  ) : CdkObject(cdkObject), CfnTaskTemplateProps {
    override fun clientToken(): String? = unwrap(this).getClientToken()

    override fun constraints(): Any? = unwrap(this).getConstraints()

    override fun contactFlowArn(): String? = unwrap(this).getContactFlowArn()

    override fun defaults(): Any? = unwrap(this).getDefaults()

    override fun description(): String? = unwrap(this).getDescription()

    override fun fields(): Any? = unwrap(this).getFields()

    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    override fun name(): String? = unwrap(this).getName()

    override fun status(): String? = unwrap(this).getStatus()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTaskTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplateProps):
        CfnTaskTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTaskTemplateProps):
        software.amazon.awscdk.services.connect.CfnTaskTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnTaskTemplateProps
  }
}
