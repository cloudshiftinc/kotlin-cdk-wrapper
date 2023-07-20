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

package cloudshift.awscdk.dsl.services.personalize

import software.amazon.awscdk.services.personalize.CfnDataset
import software.amazon.awscdk.services.personalize.CfnDatasetGroup
import software.amazon.awscdk.services.personalize.CfnDatasetGroupProps
import software.amazon.awscdk.services.personalize.CfnDatasetProps
import software.amazon.awscdk.services.personalize.CfnSchema
import software.amazon.awscdk.services.personalize.CfnSchemaProps
import software.amazon.awscdk.services.personalize.CfnSolution
import software.amazon.awscdk.services.personalize.CfnSolutionProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object personalize {
    public inline fun cfnDataset(
        scope: Construct,
        id: String,
        block: CfnDatasetDsl.() -> Unit = {},
    ): CfnDataset {
        val builder = CfnDatasetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetDataSourceProperty(
        block: CfnDatasetDataSourcePropertyDsl.() -> Unit =
            {},
    ): CfnDataset.DataSourceProperty {
        val builder = CfnDatasetDataSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetDatasetImportJobProperty(
        block: CfnDatasetDatasetImportJobPropertyDsl.() -> Unit =
            {},
    ): CfnDataset.DatasetImportJobProperty {
        val builder = CfnDatasetDatasetImportJobPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetGroup(
        scope: Construct,
        id: String,
        block: CfnDatasetGroupDsl.() -> Unit = {},
    ): CfnDatasetGroup {
        val builder = CfnDatasetGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetGroupProps(block: CfnDatasetGroupPropsDsl.() -> Unit = {}): CfnDatasetGroupProps {
        val builder = CfnDatasetGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetProps(block: CfnDatasetPropsDsl.() -> Unit = {}): CfnDatasetProps {
        val builder = CfnDatasetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSchema(
        scope: Construct,
        id: String,
        block: CfnSchemaDsl.() -> Unit = {},
    ): CfnSchema {
        val builder = CfnSchemaDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSchemaProps(block: CfnSchemaPropsDsl.() -> Unit = {}): CfnSchemaProps {
        val builder = CfnSchemaPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSolution(
        scope: Construct,
        id: String,
        block: CfnSolutionDsl.() -> Unit = {},
    ): CfnSolution {
        val builder = CfnSolutionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSolutionAlgorithmHyperParameterRangesProperty(
        block: CfnSolutionAlgorithmHyperParameterRangesPropertyDsl.() -> Unit =
            {},
    ): CfnSolution.AlgorithmHyperParameterRangesProperty {
        val builder = CfnSolutionAlgorithmHyperParameterRangesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSolutionAutoMLConfigProperty(
        block: CfnSolutionAutoMLConfigPropertyDsl.() -> Unit =
            {},
    ): CfnSolution.AutoMLConfigProperty {
        val builder = CfnSolutionAutoMLConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSolutionCategoricalHyperParameterRangeProperty(
        block: CfnSolutionCategoricalHyperParameterRangePropertyDsl.() -> Unit =
            {},
    ): CfnSolution.CategoricalHyperParameterRangeProperty {
        val builder = CfnSolutionCategoricalHyperParameterRangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSolutionContinuousHyperParameterRangeProperty(
        block: CfnSolutionContinuousHyperParameterRangePropertyDsl.() -> Unit =
            {},
    ): CfnSolution.ContinuousHyperParameterRangeProperty {
        val builder = CfnSolutionContinuousHyperParameterRangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSolutionHpoConfigProperty(
        block: CfnSolutionHpoConfigPropertyDsl.() -> Unit =
            {},
    ): CfnSolution.HpoConfigProperty {
        val builder = CfnSolutionHpoConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSolutionHpoObjectiveProperty(
        block: CfnSolutionHpoObjectivePropertyDsl.() -> Unit =
            {},
    ): CfnSolution.HpoObjectiveProperty {
        val builder = CfnSolutionHpoObjectivePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSolutionHpoResourceConfigProperty(
        block: CfnSolutionHpoResourceConfigPropertyDsl.() -> Unit =
            {},
    ): CfnSolution.HpoResourceConfigProperty {
        val builder = CfnSolutionHpoResourceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSolutionIntegerHyperParameterRangeProperty(
        block: CfnSolutionIntegerHyperParameterRangePropertyDsl.() -> Unit =
            {},
    ): CfnSolution.IntegerHyperParameterRangeProperty {
        val builder = CfnSolutionIntegerHyperParameterRangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSolutionProps(block: CfnSolutionPropsDsl.() -> Unit = {}): CfnSolutionProps {
        val builder = CfnSolutionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSolutionSolutionConfigProperty(
        block: CfnSolutionSolutionConfigPropertyDsl.() -> Unit =
            {},
    ): CfnSolution.SolutionConfigProperty {
        val builder = CfnSolutionSolutionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
