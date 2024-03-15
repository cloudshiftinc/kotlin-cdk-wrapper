@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * A set of attributes, useful to set Read and Write attributes.
 *
 * Example:
 *
 * ```
 * UserPool pool = new UserPool(this, "Pool");
 * ClientAttributes clientWriteAttributes = (new
 * ClientAttributes()).withStandardAttributes(StandardAttributesMask.builder().fullname(true).email(true).build()).withCustomAttributes("favouritePizza",
 * "favouriteBeverage");
 * ClientAttributes clientReadAttributes =
 * clientWriteAttributes.withStandardAttributes(StandardAttributesMask.builder().emailVerified(true).build()).withCustomAttributes("pointsEarned");
 * pool.addClient("app-client", UserPoolClientOptions.builder()
 * // ...
 * .readAttributes(clientReadAttributes)
 * .writeAttributes(clientWriteAttributes)
 * .build());
 * ```
 */
public open class ClientAttributes internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cognito.ClientAttributes,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.cognito.ClientAttributes())

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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b92efc43d9edc56ffb41e35942a05b2fa0e6a82608012541a2e38c3c0dd445ba")
  public open fun withStandardAttributes(attributes: StandardAttributesMask.Builder.() -> Unit):
      ClientAttributes = withStandardAttributes(StandardAttributesMask(attributes))

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.ClientAttributes):
        ClientAttributes = ClientAttributes(cdkObject)

    internal fun unwrap(wrapped: ClientAttributes):
        software.amazon.awscdk.services.cognito.ClientAttributes = wrapped.cdkObject
  }
}
