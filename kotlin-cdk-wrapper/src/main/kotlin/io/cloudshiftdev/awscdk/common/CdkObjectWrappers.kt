@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.common

import java.util.IdentityHashMap
import kotlin.Any

internal object CdkObjectWrappers {
  private val instanceMap: IdentityHashMap<Any, CdkObject> = IdentityHashMap()

  internal fun register(cdkObject: CdkObject) {
    instanceMap[cdkObject.cdkObject] = cdkObject
  }

  internal fun wrap(cdkObject: Any): Any? = instanceMap[cdkObject]
}
