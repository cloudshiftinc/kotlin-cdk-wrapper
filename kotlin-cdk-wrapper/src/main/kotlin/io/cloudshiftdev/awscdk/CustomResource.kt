@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CustomResource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CustomResource,
) : Resource(cdkObject) {
  public open fun att(attributeName: String): Reference =
      unwrap(this).getAtt(attributeName).let(Reference::wrap)

  public open fun attString(attributeName: String): String =
      unwrap(this).getAttString(attributeName)

  public open fun ref(): String = unwrap(this).getRef()

  @CdkDslMarker
  public interface Builder {
    public fun pascalCaseProperties(pascalCaseProperties: Boolean)

    public fun properties(properties: Map<String, Any>)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun resourceType(resourceType: String)

    public fun serviceToken(serviceToken: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CustomResource.Builder =
        software.amazon.awscdk.CustomResource.Builder.create(scope, id)

    override fun pascalCaseProperties(pascalCaseProperties: Boolean) {
      cdkBuilder.pascalCaseProperties(pascalCaseProperties)
    }

    override fun properties(properties: Map<String, Any>) {
      cdkBuilder.properties(properties)
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    override fun serviceToken(serviceToken: String) {
      cdkBuilder.serviceToken(serviceToken)
    }

    public fun build(): software.amazon.awscdk.CustomResource = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CustomResource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CustomResource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CustomResource): CustomResource =
        CustomResource(cdkObject)

    internal fun unwrap(wrapped: CustomResource): software.amazon.awscdk.CustomResource =
        wrapped.cdkObject
  }
}
