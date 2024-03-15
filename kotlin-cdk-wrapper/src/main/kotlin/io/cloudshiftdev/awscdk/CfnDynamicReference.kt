@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import kotlin.String

/**
 * References a dynamically retrieved value.
 *
 * This is a Construct so that subclasses will (eventually) be able to attach
 * metadata to themselves without having to change call signatures.
 *
 * Example:
 *
 * ```
 * new CfnDynamicReference(CfnDynamicReferenceService.SECRETS_MANAGER,
 * "secret-id:secret-string:json-key:version-stage:version-id");
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html)
 */
public open class CfnDynamicReference internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CfnDynamicReference,
) : Intrinsic(cdkObject) {
  public constructor(service: CfnDynamicReferenceService, key: String) :
      this(software.amazon.awscdk.CfnDynamicReference(CfnDynamicReferenceService.unwrap(service),
      key))

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.CfnDynamicReference): CfnDynamicReference =
        CfnDynamicReference(cdkObject)

    internal fun unwrap(wrapped: CfnDynamicReference): software.amazon.awscdk.CfnDynamicReference =
        wrapped.cdkObject
  }
}
