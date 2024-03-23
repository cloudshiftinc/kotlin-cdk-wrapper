@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.common

import kotlin.Any

public abstract class CdkObject(
  internal open val cdkObject: Any,
) {
  init {
     CdkObjectWrappers.register(this)}
}
