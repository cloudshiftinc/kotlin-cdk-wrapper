@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.personalize

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSchema internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.personalize.CfnSchema,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrSchemaArn(): String = unwrap(this).getAttrSchemaArn()

  public open fun domain(): String? = unwrap(this).getDomain()

  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun schema(): String = unwrap(this).getSchema()

  public open fun schema(`value`: String) {
    unwrap(this).setSchema(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun domain(domain: String)

    public fun name(name: String)

    public fun schema(schema: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.personalize.CfnSchema.Builder =
        software.amazon.awscdk.services.personalize.CfnSchema.Builder.create(scope, id)

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun schema(schema: String) {
      cdkBuilder.schema(schema)
    }

    public fun build(): software.amazon.awscdk.services.personalize.CfnSchema = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.personalize.CfnSchema.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSchema {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSchema(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSchema): CfnSchema =
        CfnSchema(cdkObject)

    internal fun unwrap(wrapped: CfnSchema): software.amazon.awscdk.services.personalize.CfnSchema =
        wrapped.cdkObject
  }
}