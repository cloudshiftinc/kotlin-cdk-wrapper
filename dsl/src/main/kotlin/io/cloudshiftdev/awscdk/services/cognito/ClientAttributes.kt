package io.cloudshiftdev.awscdk.services.cognito

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class ClientAttributes internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.ClientAttributes,
) {
  /**
   * The list of attributes represented by this ClientAttributes.
   */
  public open fun attributes(): List<String> = unwrap(this).attributes()

  /**
   * Creates a custom ClientAttributes with the specified attributes.
   *
   * @param attributes a list of custom attributes to add to the set. 
   */
  public open fun withCustomAttributes(attributes: String): ClientAttributes =
      unwrap(this).withCustomAttributes(attributes).let(ClientAttributes::wrap)

  /**
   * Creates a custom ClientAttributes with the specified attributes.
   *
   * @param attributes a list of standard attributes to add to the set. 
   */
  public open fun withStandardAttributes(attributes: StandardAttributesMask): ClientAttributes =
      unwrap(this).withStandardAttributes(attributes.let(StandardAttributesMask::unwrap)).let(ClientAttributes::wrap)

  /**
   * Creates a custom ClientAttributes with the specified attributes.
   *
   * @param attributes a list of standard attributes to add to the set. 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b92efc43d9edc56ffb41e35942a05b2fa0e6a82608012541a2e38c3c0dd445ba")
  public open fun withStandardAttributes(attributes: StandardAttributesMask.Builder.() -> Unit):
      ClientAttributes = withStandardAttributes(StandardAttributesMask(attributes))

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.ClientAttributes):
        ClientAttributes = ClientAttributes(cdkObject)

    internal fun unwrap(wrapped: ClientAttributes):
        software.amazon.awscdk.services.cognito.ClientAttributes = wrapped.cdkObject
  }
}
