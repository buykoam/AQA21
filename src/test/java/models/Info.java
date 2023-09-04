package models;

import lombok.*;

@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@RequiredArgsConstructor
public class Info {
    @EqualsAndHashCode.Exclude
    private int id;

    @NonNull
    private String firstname;

    @NonNull @With(AccessLevel.PROTECTED)
    private String lastname;
    //@ToString.Exclude
    private String code;
}