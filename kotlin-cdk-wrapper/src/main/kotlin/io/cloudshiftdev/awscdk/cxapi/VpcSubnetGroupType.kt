@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

public enum class VpcSubnetGroupType(
  private val cdkObject: software.amazon.awscdk.cxapi.VpcSubnetGroupType,
) {
  PUBLIC(software.amazon.awscdk.cxapi.VpcSubnetGroupType.PUBLIC),
  PRIVATE(software.amazon.awscdk.cxapi.VpcSubnetGroupType.PRIVATE),
  ISOLATED(software.amazon.awscdk.cxapi.VpcSubnetGroupType.ISOLATED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.VpcSubnetGroupType):
        VpcSubnetGroupType = when (cdkObject) {
      software.amazon.awscdk.cxapi.VpcSubnetGroupType.PUBLIC -> VpcSubnetGroupType.PUBLIC
      software.amazon.awscdk.cxapi.VpcSubnetGroupType.PRIVATE -> VpcSubnetGroupType.PRIVATE
      software.amazon.awscdk.cxapi.VpcSubnetGroupType.ISOLATED -> VpcSubnetGroupType.ISOLATED
    }

    internal fun unwrap(wrapped: VpcSubnetGroupType):
        software.amazon.awscdk.cxapi.VpcSubnetGroupType = wrapped.cdkObject
  }
}
