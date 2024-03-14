package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String
import kotlin.collections.List

public open class IamResource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.IamResource,
) {
  public open fun resourceArns(api: GraphqlApiBase): List<String> =
      unwrap(this).resourceArns(api.let(GraphqlApiBase::unwrap)) ?: emptyList()

  public companion object {
    public open fun all(): IamResource =
        software.amazon.awscdk.services.appsync.IamResource.all().let(IamResource::wrap)

    public open fun custom(arns: String): IamResource =
        software.amazon.awscdk.services.appsync.IamResource.custom(arns).let(IamResource::wrap)

    public open fun ofType(type: String, fields: String): IamResource =
        software.amazon.awscdk.services.appsync.IamResource.ofType(type,
        fields).let(IamResource::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.IamResource): IamResource =
        IamResource(cdkObject)

    internal fun unwrap(wrapped: IamResource): software.amazon.awscdk.services.appsync.IamResource =
        wrapped.cdkObject
  }
}
