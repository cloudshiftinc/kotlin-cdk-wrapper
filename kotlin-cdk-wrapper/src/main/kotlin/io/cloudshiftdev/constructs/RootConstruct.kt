@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.constructs

import kotlin.String

public open class RootConstruct(
  cdkObject: software.constructs.RootConstruct,
) : Construct(cdkObject) {
  public constructor() : this(software.constructs.RootConstruct()
  )

  public constructor(id: String) : this(software.constructs.RootConstruct(id)
  )

  public companion object {
    internal fun wrap(cdkObject: software.constructs.RootConstruct): RootConstruct =
        RootConstruct(cdkObject)

    internal fun unwrap(wrapped: RootConstruct): software.constructs.RootConstruct =
        wrapped.cdkObject as software.constructs.RootConstruct
  }
}
