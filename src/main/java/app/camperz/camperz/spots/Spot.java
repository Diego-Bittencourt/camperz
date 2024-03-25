package app.camperz.camperz.spots;

import javax.xml.stream.Location;
import java.time.LocalDateTime;
import java.util.Date;

public record Spot(
        Integer id,
        String title,
        String addedDate,
        String description,
        String location
) {}
