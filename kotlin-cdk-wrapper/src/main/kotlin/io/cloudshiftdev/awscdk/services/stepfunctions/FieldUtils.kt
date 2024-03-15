@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public open class FieldUtils internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.FieldUtils,
) : CdkObject(cdkObject) {
  public companion object {
    public fun containsTaskToken(): Boolean =
        software.amazon.awscdk.services.stepfunctions.FieldUtils.containsTaskToken()

    public fun containsTaskToken(obj: Map<String, Any>): Boolean =
        software.amazon.awscdk.services.stepfunctions.FieldUtils.containsTaskToken(obj)

    public fun findReferencedPaths(): List<String> =
        software.amazon.awscdk.services.stepfunctions.FieldUtils.findReferencedPaths()

    public fun findReferencedPaths(obj: Map<String, Any>): List<String> =
        software.amazon.awscdk.services.stepfunctions.FieldUtils.findReferencedPaths(obj)

    public fun renderObject(): Map<String, Any> =
        software.amazon.awscdk.services.stepfunctions.FieldUtils.renderObject() ?: emptyMap()

    public fun renderObject(obj: Map<String, Any>): Map<String, Any> =
        software.amazon.awscdk.services.stepfunctions.FieldUtils.renderObject(obj) ?: emptyMap()

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.FieldUtils):
        FieldUtils = FieldUtils(cdkObject)

    internal fun unwrap(wrapped: FieldUtils):
        software.amazon.awscdk.services.stepfunctions.FieldUtils = wrapped.cdkObject
  }
}
