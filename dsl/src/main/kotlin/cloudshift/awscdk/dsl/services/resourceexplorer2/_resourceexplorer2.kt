@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.resourceexplorer2

import software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation
import software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps
import software.amazon.awscdk.services.resourceexplorer2.CfnIndex
import software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps
import software.amazon.awscdk.services.resourceexplorer2.CfnView
import software.amazon.awscdk.services.resourceexplorer2.CfnViewProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object resourceexplorer2 {
    public inline fun cfnDefaultViewAssociation(
        scope: Construct,
        id: String,
        block: CfnDefaultViewAssociationDsl.() -> Unit = {},
    ): CfnDefaultViewAssociation {
        val builder = CfnDefaultViewAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDefaultViewAssociationProps(block: CfnDefaultViewAssociationPropsDsl.() -> Unit = {}): CfnDefaultViewAssociationProps {
        val builder = CfnDefaultViewAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIndex(
        scope: Construct,
        id: String,
        block: CfnIndexDsl.() -> Unit = {},
    ): CfnIndex {
        val builder = CfnIndexDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIndexProps(block: CfnIndexPropsDsl.() -> Unit = {}): CfnIndexProps {
        val builder = CfnIndexPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnView(
        scope: Construct,
        id: String,
        block: CfnViewDsl.() -> Unit = {},
    ): CfnView {
        val builder = CfnViewDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnViewFiltersProperty(block: CfnViewFiltersPropertyDsl.() -> Unit = {}): CfnView.FiltersProperty {
        val builder = CfnViewFiltersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnViewIncludedPropertyProperty(
        block: CfnViewIncludedPropertyPropertyDsl.() -> Unit =
            {},
    ): CfnView.IncludedPropertyProperty {
        val builder = CfnViewIncludedPropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnViewProps(block: CfnViewPropsDsl.() -> Unit = {}): CfnViewProps {
        val builder = CfnViewPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
