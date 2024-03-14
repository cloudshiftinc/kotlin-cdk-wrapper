package io.cloudshiftdev.awscdk

import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class CustomResourceProvider internal constructor(
  private val cdkObject: software.amazon.awscdk.CustomResourceProvider,
) : CustomResourceProviderBase(cdkObject) {
  public companion object {
    public open fun orCreate(
      scope: Construct,
      uniqueid: String,
      props: CustomResourceProviderProps,
    ): String =
        software.amazon.awscdk.CustomResourceProvider.getOrCreate(scope.let(Construct::unwrap),
        uniqueid, props.let(CustomResourceProviderProps::unwrap))

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1dfac87d524e6b53be86d072ef3f093e653ab6e867547f672869cb4906eba94c")
    public open fun orCreate(
      scope: Construct,
      uniqueid: String,
      props: CustomResourceProviderProps.Builder.() -> Unit,
    ): String = orCreate(scope, uniqueid, CustomResourceProviderProps(props))

    public open fun orCreateProvider(
      scope: Construct,
      uniqueid: String,
      props: CustomResourceProviderProps,
    ): CustomResourceProvider =
        software.amazon.awscdk.CustomResourceProvider.getOrCreateProvider(scope.let(Construct::unwrap),
        uniqueid, props.let(CustomResourceProviderProps::unwrap)).let(CustomResourceProvider::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33ee0785f227952a74fc604843ccf9107ba12152626d5e79a95041f6a89b3617")
    public open fun orCreateProvider(
      scope: Construct,
      uniqueid: String,
      props: CustomResourceProviderProps.Builder.() -> Unit,
    ): CustomResourceProvider = orCreateProvider(scope, uniqueid,
        CustomResourceProviderProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.CustomResourceProvider):
        CustomResourceProvider = CustomResourceProvider(cdkObject)

    internal fun unwrap(wrapped: CustomResourceProvider):
        software.amazon.awscdk.CustomResourceProvider = wrapped.cdkObject
  }
}
